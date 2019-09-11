
public abstract class Animal {
    private double weight;

    public Animal(double weight) {
        this.weight = weight;
    }
    public double getWeight() { return weight; }

    public abstract String sound();
}

