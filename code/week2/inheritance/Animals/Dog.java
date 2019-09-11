package Animals;

//1. break into separate files
//2. add private data and constructor to Reptile
//3. add getter/setter to reptile



public class Dog extends Mammal {
    private String name;
    public Dog() {
        super("blue");
        name = "spot";
        System.out.println("Dog constructor name: " + name);
    }
        
    public static void main(String args[]) {
        //Feel free to uncomment everything
        //Notice how the Dog constructor will automatically call
        //the parent Mammal one-arg constructor which will automatically
        //call the grandparent Animal default constructor
        
        //Animal a = new Animal();
        //Mammal m = new Mammal();
        Dog d = new Dog();
        //Reptile r = new Reptile();
        
        //System.out.println(m instanceof Animal);
        //System.out.println(d instanceof Mammal);
        //System.out.println(d instanceof Animal);
        //System.out.println(r.getBloodType());
    }
}