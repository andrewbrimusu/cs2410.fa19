class Loops {
    public static void main(String args[]) {
        
        int age = 37;
        
        
        double gpa = 3.5;
        double bignum = 43562436236.13465432161;
        boolean havingFun = true;
        
        if (havingFun) {
            System.out.println("Hollar hollar, CS is awesome!");
        }
        else if (age > 40) {
            System.out.println("old school!");
        }
        else {
            System.out.println("bored, heading to the quad!");
        }
        
        System.out.println("age: "+age);
        
        //two ways to initialize an array in java
        int[] data = {10,20,30,40,50,60,71,80,90,91};
        // or
        
        int[] data2;
        data2 = new int[] {10,20,30,40,50,60,71,80,90,91};
        
        
        for(int i=0; i<10; i++ ) {
            System.out.println("data[i]: "+data[i]);
        }
        

        for(int d : data) {
            System.out.println("d: "+d);
        }
        
        
    }
}

