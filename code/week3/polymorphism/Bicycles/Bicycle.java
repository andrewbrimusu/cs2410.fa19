public class Bicycle {
    private int cadence;
    private int speed;
    private int gear;
    
    public Bicycle(int cad, int sp, int gr) {
        cadence = cad;
        speed = sp;
        gear = gr;
    }
    
    public void printDescription(){
        System.out.println("\nBike is " + "in gear " + this.gear
            + " with a cadence of " + this.cadence +
            " and travelling at a speed of " + this.speed + ". ");
    }
}
