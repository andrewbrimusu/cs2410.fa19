
public abstract class Fruit implements Edible {
    private String color;

    public Fruit(String color) {
        this.color = color;
    }

    public String getColor() { return this.color; }
}
