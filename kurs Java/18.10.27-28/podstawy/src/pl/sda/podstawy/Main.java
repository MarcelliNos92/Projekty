package pl.sda.podstawy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n,
//      a następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana liczba.
//      Przykładowo, dla liczby 71 program powinien wyświetlić: 1 2 4 8 16 32 64

        int n = 134;
        int i = 0;
        while (Math.pow(2, i) < n) {
            System.out.println(" " + Math.pow(2, i));
            i++;
        }

//        Napisać program, który wczytuje liczby podawane przez użytkownika dotąd,
//        dopóki nie podana zostanie liczba 0. Następnie wyświetlić sumę wszystkich podanych liczb.


        Scanner wejscie = new Scanner(System.in);
        int[] tablica = new int[100];
        int j = 0;

        while (j >= 0) {

            System.out.println("podaj kolejno liczbę " + (j + 1) + ":");
            tablica[j] = wejscie.nextInt();

            if (tablica[j] == 0) {
                break;
            } else {
                j++;
            }

        }
        int wynik = 0;
        for (int m = 0; m < j; m++) {

            System.out.print(tablica[m] + " ");
            wynik = wynik + tablica[m];
        }
        System.out.println("Suma podanych liczb to: " + wynik);

//        Napisać program, który pobiera od użytkownika ciąg liczb całkowitych.
//        Pobieranie danych kończone jest podaniem wartości 0 (nie jest brana pod uwagę w obliczeniach).
//        W następnej kolejności program powinien wyświetlić: • najmniejszą i największą podaną wartość,
//        • sumę podanych liczb, • średnią arytmetyczną podanych liczb.
//        Przykład: Użytkownik podał ciąg: 1, -4, 2, 17, 0. Wynik programu: min: -4 max: 17 suma: 16 średnia: 4

        Scanner input = new Scanner(System.in);
        int[] table = new int[100];
        int k = 0;


        while (k >= 0) {

            System.out.println("podaj kolejno liczbę " + (k + 1) + ":");
            table[k] = input.nextInt();

            if (table[k] == 0) {
                break;
            } else {
                k++;
            }
        }
        int max = table[0];
        int min = table[0];
        int sum = 0;
        for (int l = 0; l < k; l++) {

            if (table[l] > max) {
                max = table[l];
            }

            if (table[l] < min) {
                min = table[l];
            }

            sum = sum + table[l];

        }

        int average;
        average =  sum/k;

        System.out.println("min: " + min);
        System.out.println("max " + max);
        System.out.println("suma: " + sum);
        System.out.println("average: " + average);


    }
}
