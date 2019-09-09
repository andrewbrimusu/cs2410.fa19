//11. A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.

class Bike{  
    int speedlimit=90;  
}

public class Honda extends Bike{  
    int speedlimit=150;
    //public Honda(int sl) {speedlimit=sl;}
    
    //Notice that 90 is outputted, not 150.
    //This is because data members are not automatically downcast
    //even when using polymorphism
    public static void main(String args[]){  
        Bike obj=new Honda();  
        //Honda hon1 = (Honda)obj; uncomment this and it will be a Honda, with a speedlimit 150
        System.out.println(obj.speedlimit);//90  
    }  
}