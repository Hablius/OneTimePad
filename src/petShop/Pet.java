package petShop;

public class Pet {
    private static int nextID = 0;
    private int ID;
    public enum Species {Dog, Cat, Snake, Bird, Fish}
    public enum Gender {Male, Female}
    private Species species;
    private Gender gender;
    private String name;

    // Constructor with validation
    public Pet(Species species, String name, Gender gender) {
        if (species == null || name == null || name.trim().isEmpty() || gender == null) {
            throw new IllegalArgumentException("Invalid input: None of the parameters can be null or empty.");
        }
        this.ID = getNextID();  // Auto-generate ID
        this.species = species;
        this.name = name.trim();
        this.gender = gender;
    }

    // Setter for species with validation
    public void setSpecies(Species species) {
        if (species == null) {
            throw new IllegalArgumentException("Species cannot be null.");
        }
        this.species = species;
    }

    // Getter for species
    public Species getSpecies() {
        return species;
    }

    // Setter for gender with validation
    public void setGender(Gender gender) {
        if (gender == null) {
            throw new IllegalArgumentException("Gender cannot be null.");
        }
        this.gender = gender;
    }

    // Getter for gender
    public Gender getGender() {
        return gender;
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name.trim();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    public int getID(){
        return ID;
    }

    // Private method to handle ID increment
    private static int getNextID() {
        return nextID++;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "ID=" + ID +
                ", species=" + species +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
