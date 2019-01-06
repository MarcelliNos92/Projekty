package pl.sda.struktury_danych.SPOJ;

import java.util.Scanner;

public class MainTablice {

    public static void main(String[] args) {
         Scanner wejscie = new Scanner(System.in);
         int iloscTestow;

         iloscTestow = wejscie.nextInt();

         for(int i = 0; i < iloscTestow; i++){

             int wielkoscTablicy = wejscie.nextInt();
             int [] Tablica = new int[wielkoscTablicy];

             for(int j = 0; j < wielkoscTablicy; j++){

                 Tablica[j] = wejscie.nextInt(); //czy dane są pobierane poprawnie?

             }
             drukujTablice(Tablica, wielkoscTablicy);

         }

    }

    public static void drukujTablice (int[] Tablica, int wielkoscTablicy){
        for(int i = 0; i < wielkoscTablicy; i++) {
            System.out.print(Tablica[i]);

        }
        System.out.println("");

    }
}
