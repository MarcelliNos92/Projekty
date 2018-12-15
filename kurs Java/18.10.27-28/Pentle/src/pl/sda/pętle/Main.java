package pl.sda.pętle;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {



        for (int i = 10; i > 0; i--) {
            System.out.println("iteracja numer: " + i);

        }

        //sprawdza warunek przed iteracją
        int licznik = 0;
        while (licznik < 3) {
            System.out.println("coś");
            licznik++;
        }

        // sprawdza warunek po iteracji
        int l = 0;
        do {
            System.out.println("Iteracja: " + l);
            l++;
        } while (l < 3);

        for (int a = 0; a < 5; a++) {
            System.out.println("Pętla zew: " + a);
            for (int j = 0; j < 5; j++) {
                System.out.println("Pętla wew: " + j);
            }
            System.out.println("======");
        }

        // zad 6 pętle
        for (int b = 1; b < 6; b++) {
            System.out.println("");

            for (int c = 0; c < b; c++) {
                System.out.print("O");
            }

        }

        System.out.println("");

        // zad 7 pętle

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if (!(i == 1 && j > 0) || (j == 5)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // zad 7 pętle kwadrat 6x20 pusty w środku

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 20; j++) {
                if (!(i > 0 && j > 0 ) || (j == 19) || (i==5)){
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}


