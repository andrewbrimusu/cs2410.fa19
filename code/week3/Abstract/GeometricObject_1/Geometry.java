public class Geometry {
    public static void main(String[] args) {

        Circle c1 = new Circle(1, "red", true);
        System.out.printf("The color of the circle is: %s\n", c1.getColor());
        System.out.printf("The radius of the circle is: %f\n", c1.getRadius());
        System.out.printf("The area of the circle is: %f\n", c1.getArea());
        System.out.printf("The perimeter of the circle is: %f\n", c1.getPerimeter());

        Rectangle r1 = new Rectangle(2, 4, "green", false);
        System.out.printf("The color of the rectangle is: %s\n", r1.getColor());
        System.out.printf("The area of the rectangle is: %f\n", r1.getArea());
        System.out.printf("The perimeter of the rectangle is: %f\n", r1.getPerimeter());

        System.out.println(c1.toString());
        System.out.println(r1.toString());

        System.out.printf("Do c1 and r1 have the same area? %b\n", equalArea(c1, r1));

        report(c1, "--- Circle ---");
        report(r1, "--- Rectangle ---");
    }

    public static void report(GeometricObject object, String title) {
        System.out.println(title);
        System.out.printf("Created on       : %s\n", object.getDateCreated());
        System.out.printf("The area is      : %f\n", object.getArea());
        System.out.printf("The perimeter is : %f\n", object.getPerimeter());
        System.out.printf("The Color is     : %s\n", object.getDateCreated(), object.getColor());
    }

    public static boolean equalArea(GeometricObject o1, GeometricObject o2) {
        return o1.getArea() == o2.getArea();
    }

}