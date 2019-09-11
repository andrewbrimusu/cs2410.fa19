package Animals;


public class Animal {
    private String species;
    public Animal() {
        species = "unknown";
        System.out.println("Animal constructor specis: "+species);
    }
    public Animal(String s) {
        species = s;
    }
    public void setSpecies(String s) {species = s;}
    public String getSpecies() {return species;}
    
}