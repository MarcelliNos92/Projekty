package pl.sda.struktury_danych.SPOJ;

import java.util.Scanner;

public class MainLiczbyPierwsze {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int liczba = scanner.nextInt();
            boolean pierwsza = czyPierwsza(liczba);

            if (pierwsza) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }

        public static boolean czyPierwsza(int n) {
            if(n < 2) {
                return false;
            }

            for(int i =2; i*i <=n; i++) {
                if(n % i == 0) {
                    return false;
                }
            }

            return true;
        }

    }

