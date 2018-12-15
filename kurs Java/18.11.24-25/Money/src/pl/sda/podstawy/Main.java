package pl.sda.podstawy;

public class Main {

    public static void main(String[] args) {

//        Money money = new Money(45);

        System.out.println(new Money(5).equals(new Money(5)));
        System.out.println(new Money(5).equals(new Money(6)));
    }
}
