//5-8. Example from http://www.cs.utexas.edu/~cannata/cs345/Class%20Notes/14%20Java%20Upcasting%20Downcasting.htm
//9. goto Animals/TestPolymorphism.java

class Animal {
	int health = 100;
}

class Mammal extends Animal { 
    public void purr() {
        System.out.println("purr from mammal");
    }
}

class Cat extends Mammal {
    public void purr() {
        System.out.println("purr");
    }
}

class Dog extends Mammal { }


    
public class Test {	 
    public static void stroke(Animal a){
        System.out.println("you stroke the "+a);
    }
    
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c.health);
        Dog d = new Dog();
        System.out.println(d.health);
        
        //5. upcasting example
        System.out.println(c);
        Mammal m = c; // upcasting
        System.out.println(m);
        
        /*
        This printed:
        Cat@a90653
        Cat@a90653
        */
        
        //6. there's no need to for programmer to upcast manually, but it's allowed
        Mammal m2 = (Mammal)new Cat();
        m2.purr();
        //same as above
        Mammal m3 = new Cat();
        
        //7. downcasting must be done manually unless using polymorphism
        Cat c2 = new Cat();		 
    	Animal a = c2;		 //automatic upcasting to Animal
    	Cat c3 = (Cat) a;    //manual downcasting back to a Cat
        
        //example safely downcasting
        Cat c4 = new Cat();		 
        Animal a2 = c4;		 //upcasting to Animal
        if(a instanceof Cat){ // testing if the Animal is a Cat
            System.out.println("It's a Cat! Now i can safely downcast it to a Cat, without a fear of failure.");        
            Cat c5 = (Cat)a2;
        }
        
        //8. Can'ts cant purr, meaning you can't access Cat methods after upcasting to Animal, until
        //after you have properly downcasted, unless you use polymorphism.
        Cat c6 = new Cat();		 
        Dog d2 = new Dog();		 
        stroke(c6); // automatic upcast to an Animal
        stroke(d2); // automatic upcast to an Animal
    }  
}
 