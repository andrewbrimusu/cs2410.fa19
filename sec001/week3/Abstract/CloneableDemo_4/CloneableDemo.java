import java.util.ArrayList;

public class CloneableDemo {
    public static void main(String[] args) {
        ArrayList<Double> data = new ArrayList<>();
        data.add(1.6);
        data.add(2.6);
        data.add(3.6);

        ArrayList<Double> copy1 = data;
        ArrayList<Double> copy2 = (ArrayList<Double>)data.clone();

        System.out.printf("data == copy1 is %b\n", data == copy1);
        System.out.printf("data == copy2 is %b\n", data == copy2);
        System.out.printf("data.equals(copy2) is %b\n", data.equals(copy2));

        int[] list1 = { 1, 2, 3 };
        int[] list2 = list1.clone();

        System.out.printf("list1: %s\n", java.util.Arrays.toString(list1));
        System.out.printf("list2: %s\n", java.util.Arrays.toString(list2));
        list2[0] = 5;
        list2[1] = 6;
        list2[2] = 7;
        System.out.printf("list1: %s\n", java.util.Arrays.toString(list1));
        System.out.printf("list2: %s\n", java.util.Arrays.toString(list2));

        House h1 = new House(2, 5000);
        House h2 = (House)h1.clone();

        System.out.printf("h1 == h2 is %b\n", h1 == h2);
        System.out.printf("h1.compareTo(h2) is %d\n", h1.compareTo(h2));
    }
}
