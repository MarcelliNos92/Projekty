package pl.sda.kalkulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner(System.in);

//        System.out.println("Podaj swój wiek: ");
//
//        int wiek = Integer.parseInt(wejscie.nextLine());
//
//        System.out.println("Twój wiek to: " + wiek);
//
//        System.out.println("Jak się nazywasz?");
//        String imie = wejscie.nextLine();
//
//        System.out.println("Witaj: " + imie);

        System.out.println("PODAJ LICZBE A");
        float a = Float.parseFloat(wejscie.nextLine());

        System.out.println("PODAJ LICZBE B");
        float b = Float.parseFloat(wejscie.nextLine());

        System.out.println("PODAJ ZNAK");
        char znak = wejscie.next().charAt(0);

        float wynik = 0;
        switch (znak) {
            case '+':
                System.out.println("Wykonuje dodawanie...");
                wynik = a + b;
                break;
            case '-':
                System.out.println("Wykonuje odejmowanie...");
                wynik = a - b;
                break;
            case '*':
                System.out.println("Wykonuje mnozenie...");
                wynik = a * b;
                break;
            case '/':
                System.out.println("Wykonuje dzielenie...");
                wynik = a / b;
                break;


        }

        System.out.println("Wynik to: " + wynik);

        // Napisz programy wyznaczające pola figur geometrycznych i objętości brył, które nie przyjmują od użytkownika ujemnych liczb wyrażających długości boków.
//                a) Pole koła r = 4.55
//        b) Pole kwadratu a = 6
//        c) Pole prostokąta a = 2 b =10
//        Sprawdzić czy długość promienia jest dodatnia.

        System.out.println("Wybierz opcję a,b lub c: ");
        System.out.println("a - pole koła o promieniu r");
        System.out.println("b - pole kwadratu boku m");
        System.out.println("c - pole prostokąta o bokach o i p");

        Scanner litera = new Scanner(System.in);
        char symbol = litera.next().charAt(0);
        double pole = 0;

        switch (symbol) {
            case 'a':
                System.out.println("Podaj promień r: ");
                Scanner promień = new Scanner(System.in);
                double r = promień.nextDouble();

                if(r < 0) {
                    System.out.println("Liczba ujemna");
                    break;
                }
                else {
                    pole = Math.PI * Math.pow(r, 2);
                    break;
                }
            case 'b':
                System.out.println("Podaj bok m: ");
                Scanner bok = new Scanner(System.in);
                double m = bok.nextDouble();

                if(m < 0) {
                    System.out.println("Liczba ujemna");
                    break;
                }
                else {
                    pole = m * m;
                    break;
                }

            case 'c':
                System.out.println("Podaj bok o: ");
                Scanner bok1 = new Scanner(System.in);
                double o = bok1.nextDouble();

                System.out.println("Podaj bok p: ");
                Scanner bok2 = new Scanner(System.in);
                double p = bok2.nextDouble();

                if(o < 0 || p < 0) {
                    System.out.println("Liczba ujemna");
                    break;
                }
                else {
                    pole = o * p;
                    break;
                }
        }

    }

}
