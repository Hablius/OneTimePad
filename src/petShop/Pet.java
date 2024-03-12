package petShop;

public class Pet {
    private static int nextID = 0;
    private int ID;
    public enum Species {Dog, Cat, Snake, Bird, Fish}
    public  enum Gender {Male, Female}
    private Species species;
    private Gender gender;
    private String name;



    private static int getNextID() {
        return nextID++;
    }


    public Pet (int ID, Species species, String name){
        this.ID = getNextID();
        this.species = species;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setSpecies(Species species){
        this.species = species;
    }

    public Species setSpecies(){
        return species;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public Gender getGender(){
        return gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
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
