interface Edible {
   public String howToEat();
}

public class EdibleDriver {
    public static void main(String[] args) {
        Object[] objects = { new Tiger(500), new Chicken(10), new Apple("red"), new Orange()};

        System.out.println("--- Everything ---");
        for (Object thing : objects) {
            if (thing instanceof Edible) {
                System.out.println(((Edible)thing).howToEat());
            }
            if (thing instanceof  Animal) {
                System.out.println(((Animal)thing).sound());
            }
        }

        System.out.println();
        System.out.println("--- Edibles Only ---");
        Edible[] edibles = { new Chicken(12), new Apple("golden"), new Orange() };
        for (Edible thing : edibles) {
            System.out.println(thing.howToEat());
        }
    }
}
