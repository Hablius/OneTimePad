package petShop;

import java.util.ArrayList;
import java.util.List;
import petShop.Pet.Species;
import petShop.Pet.Gender;

public class petShopModel {
    private List<Pet> pets = new ArrayList<>();
    private int currentIndex = -1;

    public void addPet(Pet pet) {
        pets.add(pet);
        currentIndex = pets.size() - 1;
    }

    public Pet getPet() {
        if (currentIndex != -1 && currentIndex < pets.size()) {
            return pets.get(currentIndex);
        }
        return null; // Return null if no current pet or index is out of bounds
    }

    public void savePet(Species species, Gender gender, String name) {
        if (species == null || gender == null || name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("All pet parameters must be non-null and name must not be empty.");
        }
        Pet newPet = new Pet(species, name, gender);
        pets.add(newPet);
        currentIndex = pets.size() - 1; // Update the current index to the new pet
    }

    public void deletePet() {
        if (!pets.isEmpty() && currentIndex != -1) {
            pets.remove(currentIndex);
            if (pets.isEmpty()) {
                currentIndex = -1;
            } else if (currentIndex >= pets.size()) {
                currentIndex = pets.size() - 1;
            }
        }
    }

    public Pet getCurrentPet() {
        if (currentIndex != -1) {
            return pets.get(currentIndex);
        }
        return null;
    }

    public boolean hasNext() {
        return currentIndex < pets.size() - 1;
    }

    public boolean hasPrevious() {
        return currentIndex > 0;
    }

    public Pet nextPet() {
        if (hasNext()) {
            currentIndex++;
            return getCurrentPet();
        }
        return null;
    }

    public Pet previousPet() {
        if (hasPrevious()) {
            currentIndex--;
            return getCurrentPet();
        }
        return null;
    }
}
