package pl.sda.hash;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Janek");
        Person person1 = new Person("Janek");

        System.out.println(person);
        System.out.println(person1);
        System.out.println(Integer.toHexString(person.hashCode()));

    }
}
