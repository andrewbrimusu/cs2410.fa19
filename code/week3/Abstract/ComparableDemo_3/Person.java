public class Person implements Comparable<Person> {
    private int age;
    private String nameFirst;
    private String nameLast;

    public Person(String nameFirst, String nameLast, int age) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        if (this.age > p.age) {
            return 1;
        }
        else if (this.age == p.age) {
            return 0;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s : %d", nameFirst, nameLast, age);
    }
}