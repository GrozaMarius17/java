package Person;
public class Main {
    public static void main(String[] args) {
        Person marius = new Person("Marius", 27, true);
        Person raluca = new Person("Raluca", 25, true);
        Person sami = new Person("Sami", 18, false);
        printPerson(raluca);
        printPerson(marius);
        printPerson(sami);
    }

    public static void printPerson(Person X) {
        String name = X.getName();
        int age = X.getAge();
        boolean married = X.isMarried();
        System.out.println(name);
        System.out.println(age);
        System.out.println(married);
    }
}
