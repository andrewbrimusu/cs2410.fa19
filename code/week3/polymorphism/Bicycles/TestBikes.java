//1. review Bicycle.java MountainBike.java RoadBike.java TestBikes.java
//2. Polymorphism uses automatic downcast during method calls.
//3. http://www.cs.utexas.edu/~cannata/cs345/Class%20Notes/14%20Java%20Upcasting%20Downcasting.htm
//4. goto Test.java

public class TestBikes {
  public static void main(String[] args){
    Bicycle bike01, bike02, bike03;

    bike01 = new Bicycle(20, 10, 1);
    bike02 = new MountainBike(20, 10, 5, "Dual");
    bike03 = new RoadBike(40, 20, 8, 23);

    bike01.printDescription();
    bike02.printDescription();
    bike03.printDescription();
    
    MountainBike mbike1, mbike2, mbike3;
    
    mbike1 = new MountainBike(20,10,1,"Dual");
    //mbike2 = new Bicycle(20, 10, 1);
  }
}