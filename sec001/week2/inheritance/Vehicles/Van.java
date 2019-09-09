//1. has_a relationship
//2. add private data int value to Speed class
//3. add getter to Speed class
//4. call getter function from van1
//5. show args[0]


public class Van extends Vehicle {
   private Speed sp;
   
   public Van() {
       sp = new Speed();
   }
   public Speed getSp() {return sp;}
   public void setSp(Speed s) {sp=s;}
   
   public static void main(String args[]) {
       System.out.println(args[0]);
       Van van1= new Van();
       System.out.println("Van's speed: "+van1.getSp().getValue());
   }
} 