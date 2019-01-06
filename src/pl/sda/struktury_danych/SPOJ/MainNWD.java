package pl.sda.struktury_danych.SPOJ;

import java.util.Scanner;

public class MainNWD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int a, b;

        for(int i = 0; i < t; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            System.out.println(obliczPrzezReszteZDzielenia(a,b));
        }
    }

    public static int obliczPrzezReszteZDzielenia(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}
