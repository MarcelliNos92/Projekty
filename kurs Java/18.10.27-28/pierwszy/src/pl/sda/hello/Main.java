package pl.sda.hello;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pierwszy program");
        System.out.println();

        int a = 10;
        int b = 15;
        int suma = a + b;
        float z = 23.21f;
        double k = 22.12;
        long l = 12341232332L;

        char znak = 'k';

        System.out.println("znak: " + (int) znak);

        if (a > b) {
            System.out.println("A jest większe!!");
        } else if (a < b) {
            System.out.println("A jest mniejsze");
        } else if (a == b) {
            System.out.println("Liczby są równe!");
        } else {
            System.out.println("warunki nie pasują");
        }

        int x = 10;
        int y = 5;
        int q = 2;

        // za pomocą instrukcji if wyszukać liczbę najmniejszą i największą

        if (x > y && x > q) {
            System.out.println("x jest największe");
        } else if (x > y && x < q) {
            System.out.println("q jest największe");
        } else if (x < y && y > q) {
            System.out.println("y jest największe");
        } else {
            System.out.println("liczby są równe");
        }

        if (x < y && x < q) {
            System.out.println("x jest najmniejsze");
        } else if (y < x && y < q) {
            System.out.println("y jest najmniejsze");
        } else if (q < y && q < x) {
            System.out.println("q jest najmniejsze");
        } else {
            System.out.println("liczby są równe");
        }

        // zad. 2 if
        if (2 * x == y) {
            System.out.println("podwojona wartość x jest równa y");
        }
        // zad. 3 if
        if (x + y == q) {
            System.out.println("suma x oraz y równa się q");
        }

        // zad. 4 if
        if (z - y == q) {
            System.out.println("różnica x oraz y równa się q");
        }

        // zad. 5 if
        if (3 * x == z + 1) {
            System.out.println("3x jest równe z+1");
        } else {
            System.out.println("3x nie jest równe z+1");
        }

        // zad. 8 if
        if (x*x > q/x +1) {
        }



    }



}

