
class Chicken extends Animal implements Edible {
    public Chicken(double weight) {
        super(weight);
    }

    // the howToEat method is inherited from the edible interface
    // and must be overidden
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    // the sound method is inherited from abstract class Animal
    // and must be overidden
    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}
