package pl.sda.oop;

import pl.sda.oop.model.Address;
import pl.sda.oop.model.Employee;

public class Boot {

    public static void start() {

        System.out.println("Startuje aplikcje...");

        Address[] address = new Address[6];
        address[0] = new Address("ul. Mała", 14 / 7, "85-067", "Grodno");
        address[1] = new Address("ul. Duża", 3 / 8, "49-067", "Zabawkowao");
        address[2] = new Address("ul. Wielka", 122 / 4, "09-067", "Szczebrzeszyn");
        address[3] = new Address("ul. Gruba", 90, "49-067", "Klepisko");
        address[4] = new Address("ul. Chuda", 3 / 3, "69-067", "Zbyszewo");
        address[5] = new Address("ul. Wąska", 8 / 1, "79-067", "Małaszewicze Duże");

        Employee[] employees = new Employee[6];
        employees[0] = new Employee("Karol", "Nowak", 222222, address[0]);
        employees[1] = new Employee("Jan", "Nowak", 887342, address[1]);
        employees[2] = new Employee("Michał", "Nowak", 679023, address[2]);
        employees[3] = new Employee("Ola", "Nowak", 222722, address[3]);
        employees[4] = new Employee("Agnes", "Nowak", 234222, address[4]);
        employees[5] = new Employee("Maciej", "Nowak", 229072, address[5]);


        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }

        System.out.println("=====================");

        for (Employee e : employees) { // for each: automatycznie przesuwa sie po tablicy
            System.out.println(e.getName() + " " + e.getSalary());
        }

        //Zwiększenie pensji wszystkich pracowników o 5%
        for (Employee e : employees) {
            e.raiseSalary(5);
        }

        //większa pensja
        //for each
        for (Employee e : employees) {
            System.out.println(e.getName() + " " + e.getSalary());
        }

        for (Employee e : employees) {
            System.out.println(e.getName() + ", " + e.getLastname() + ", " + e.getSalary() + "zł, " + e.getAddress().getStreet() + ", " + e.getAddress().getNumber() + ", " + e.getAddress().getPostalCode() + ", " + e.getAddress().getCity());
        }

        for (Employee e : employees) {
            System.out.println(e.getAddress());
        }
    }
}
