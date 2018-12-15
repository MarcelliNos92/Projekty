package pl.sda.oop;

import pl.sda.oop.model.BankAccount;
import pl.sda.oop.model.Car;
import pl.sda.oop.model.User;

public class Main {

    public static void main(String[] args) {

//        BankAccount bank = new BankAccount(1, 345664321,32.32);
        Car car1 = new Car("bmw", 3289900, "cvb", 90);
//
//        User student = new User("Jan", "Kowalski",23, bank, car1);
//        System.out.println("account number: " + student.getBankAccountAccountNumber());
//        System.out.println(student.getBankAccount());
//
//        System.out.println(car1.getModel());
//        student.setName("Karol");
//        System.out.println(student.getName());
//
//        BankAccount bank2 = new BankAccount(2, 7802163,45);
//        Car car2 = new Car("fiat", 349086,"ahk", 145);
//
//        User student2 = new User("Karol", "Nowak", 24, bank2, car2);
//        System.out.println(bank2.getAccountNumber());

        BankAccount banknr1 = new BankAccount(1, 5555, 6555, "BankDlaBogatych");
        BankAccount banknr2 = new BankAccount(2, 4444, 6532455, "BankNowoczesny");
        BankAccount banknr3 = new BankAccount(3, 3333, 234234, "Bank");
        BankAccount banknr4 = new BankAccount(4, 2222, 2342, "BigBank");

        User klient1 = new User("Jan", "Kowalski", 44, banknr1, car1);
        User klient2 = new User("Marcin", "Nowak", 66, banknr2, car1);
        User klient3 = new User("Katarzyna", "Dobroć", 33, banknr3, car1);
        User klient4 = new User("Ola", "Lewandowska", 33, banknr4, car1);

        System.out.println("Imię: " + klient1.getName());
        System.out.println("Nazwisko: " + klient1.getLastname());
        System.out.println("Wiek: " + klient1.getAge());
        System.out.println("Nazwa Banku: " + klient1.getBankAccountBankName());
        System.out.println("Saldo: " + klient1.getBankAccountBalance());





    }
}
