public class ComparableDemo {
    public static void main(String[] args) {

        Circle c1 = new Circle(4);
        Circle c2 = new Circle(6);
        Circle c3 = new Circle(4);

        System.out.println("--- Comparing Circles ---");
        compareThings(c1, c2);
        compareThings(c1, c3);
        compareThings(c2, c3);

        Person p1 = new Person("Sarah", "Evans", 26);
        Person p2 = new Person("Linda", "Connor", 28);
        Person p3 = new Person("Stephanie", "Olsen", 26);

        System.out.println("--- Comparing People ---");
        compareThings(p1, p2);
        compareThings(p1, p3);
        compareThings(p3, p2);


        Circle[] circles = new Circle[10];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(Math.random() * 10);
        }
        sortThings(circles);
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }

    public static void compareThings(Comparable x, Comparable y) {
        if (x.compareTo(y) > 0) {
            System.out.printf("%s is greater than %s\n", x, y);
        }
        else if (x.compareTo(y) == 0) {
            System.out.printf("%s is equal to %s\n", x, y);
        }
        else if (x.compareTo(y) < 0) {
            System.out.printf("%s is less than %s\n", x, y);
        }
    }

    public static void sortThings(Comparable[] data) {

        for (int position = 0; position < data.length; position++) {
            int currentMin = position;

            for (int scan = position + 1; scan < data.length; scan++) {
                if (data[scan].compareTo(data[currentMin]) < 0) {
                    currentMin = scan;
                }
            }

            if (currentMin != position) {
                Comparable temp = data[currentMin];
                data[currentMin] = data[position];
                data[position] = temp;
            }
        }
    }
}