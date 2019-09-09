import java.util.Date;

public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        this.whenBuilt = new java.util.Date();
    }

    public int getId() { return id; }
    public double getArea() { return area; }
    public java.util.Date getWhenBuilt() { return whenBuilt; }

    @Override
    public int compareTo(House c) {
        if (this.area > c.area) {
            return 1;
        }
        else if (this.area < c.area) {
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("House (%.2f)", area);
    }

    @Override
    public Object clone() {
        // -- Deep Copy 2 --
        House copy = new House(id, area);
        copy.whenBuilt = new java.util.Date();
        copy.whenBuilt.setTime(whenBuilt.getTime());
        return copy;
        // -- Deep Copy --
//        try {
//            House deepClone = (House)super.clone();
//            deepClone.whenBuilt = (java.util.Date)whenBuilt.clone();
//            return deepClone;
//        }
//        catch (CloneNotSupportedException ex) {
//            return null;
//        }
        // -- Shallow Copy --
//        try {
//            return super.clone();
//        }
//        catch (CloneNotSupportedException ex) {
//            return null;
//        }
    }
}