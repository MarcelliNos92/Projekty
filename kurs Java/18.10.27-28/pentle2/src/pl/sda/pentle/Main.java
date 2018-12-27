package pl.sda.pentle;

import java.util.Scanner;

import static pl.sda.pentle.trójkątpascala.wydruk;

public class Main {

    public static void main(String[] args) {

        wydruk(7);

        // potęgowanie zad 8.

        int a = 3;
        int b = 2;
        int wynik = 1;

        for (int i = 0; i < b; i++) {

            wynik = wynik * a;

        }
        System.out.println("a^b równa się: " + wynik);


        // zad. 9.
        Scanner input = new Scanner(System.in);

        System.out.println("wysokość: ");
        int w = Integer.parseInt(input.nextLine());

        System.out.println("grubość: ");
        int g = Integer.parseInt(input.nextLine());

        System.out.println("szerokość: ");
        int s = Integer.parseInt(input.nextLine());


        for (int i = 0; i < w; i++) {

            for (int j = 0; j < s; j++) {
                if ((j < g && i < (w - g)) || (i >= (w - g))) {
                    System.out.print("L");
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println("");
        }

        // zad 11. trójkąt z X

        int n = 5;
        for(int i = 0; i< n; i++ ){
            for(int j = 0; j < (i+n); j++) {
                if(j < n - (i+1)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println("");
        }
        int m = 7;
        int x = 0;
        for(int i = 0; i< m+1; i++ ){
            for(int j = 0; j < i; j++) {
                x = x +i;
                System.out.print(x +" ");
            }
            x=0;
            System.out.println("");
        }

    }
}

