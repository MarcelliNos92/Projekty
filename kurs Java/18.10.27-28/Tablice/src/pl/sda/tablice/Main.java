package pl.sda.tablice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int tab[] = new int[10];

        tab[0] = 12;
        tab[1] = 21;
        tab[2] = 34;
        tab[3] = 43;
        tab[4] = 33;
        tab[5] = 3;
        tab[6] = -2;
        tab[7] = 100;
        tab[8] = 32;
        tab[9] = 33;


        // wydruk od końca
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(tab[i]);

        }

        // suma tablicy
        int Suma = 0;
        for (int i = 0; i < tab.length; i++) {
            Suma = Suma + tab[i];
        }
        System.out.println("Suma elementów: " + Suma);

//        Napisz pętlę while, która wczyta 10 elementów do tablicy (typ elementów jest dowolny)

        int i = 0;
        int[] a = new int[10];
        while(i < 10){
            System.out.println("Zdefiniuj element " + i+ " : ");
            Scanner NowyElement = new Scanner(System.in);
            a[i] = Integer.parseInt(NowyElement.nextLine());
            System.out.println("Element " + i + " to " + a[i]);
            i++;
        }

        System.out.println("Drukuję wszystkie elementy:");
        int j = 0;
        while(j < 10){
            System.out.println(a[j]);
            j++;
        }
    }


}

