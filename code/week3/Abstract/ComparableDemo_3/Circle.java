public class Circle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle c) {
        if (this.radius > c.radius) {
            return 1;
        }
        else if (this.radius == c.radius) {
            return 0;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return String.format("Circle (%.2f)", radius);
    }
}