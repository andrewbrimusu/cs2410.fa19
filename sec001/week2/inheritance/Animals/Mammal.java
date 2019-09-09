package Animals;


class Mammal extends Animal {
    private String hairColor;
    public Mammal() {
        hairColor = "unknown";
        System.out.println("Mammal constuctor haircolor: " + hairColor);
    }
    public Mammal(String hc) {
        hairColor = hc;
        System.out.println("Mammal one arg constructor haircolor" + hairColor);
    }
    public String getHairColor() {return hairColor;}
    public void setHairColor(String hc) {hairColor = hc;}
}