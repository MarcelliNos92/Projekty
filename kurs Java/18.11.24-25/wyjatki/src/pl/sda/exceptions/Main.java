package pl.sda.exceptions;

import pl.sda.exceptions.exception.SalaryException;

public class Main {

    public static void main(String[] args) {

        int tab[] = {3,5,3,12};
//        int tab2[] new int[3];
//        tab2[1] = 3;
//        tab2[2] = 3;
//        tab2[3] = 3;
//        tab2[12] = 3;

        try {
            System.out.println(tab[0]);
            System.out.println(tab[10]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Mam wyjątek");
            System.out.println(e.getMessage());
            e.printStackTrace(); //szczegóły wyjątku
        }
        System.out.println(tab[3]);
        Main.exception();
        Main.testPerson();
    }

    public static void  exception() throws ArrayIndexOutOfBoundsException{
        int tab[] = {2,3,5,6};
        System.out.println(tab[2]);
//        System.out.println(tab[10]);
    }

    public static void  testPerson(){
        Person person = new Person("Jan", "Kowalski", "Torun", "34-45", "sporna", 22);
        System.out.println(person.getCity());
        Worker worker = new Worker("mechanik", 234, "Bartosz", "Szczekalski", "Wałbrzych", "87-987", "Barania", 53);
        System.out.println(worker.toString());

        if(worker.getSalary() < 2000) {
            try {
                throw new SalaryException("Za małe wynagrodzenie");
            }catch (SalaryException e) {
                System.out.println("Mój wyjątek");
                e.printStackTrace();
            }
        }

        System.out.println("Program działa dalej...");
    }
}
