//1 Talk about Abstract
//2 Declared must be instantiated as a child
//3 remove abstract
//4 add abstract class

public class AbstractDemo {

   public static void main(String [] args) {
      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
      //Employee e2 = new Employee();
      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
      //Employee e2 = new Employee();
      System.out.println("Call mailCheck using Salary reference --");
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
      ((Salary)e).getSalary();
   }
}