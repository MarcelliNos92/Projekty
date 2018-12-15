package pl.sda.struktury_danych;

import pl.sda.struktury_danych.Algorytmy.BinarySearch;
import pl.sda.struktury_danych.Algorytmy.BinarySearch2;
import pl.sda.struktury_danych.Algorytmy.ONP;
import pl.sda.struktury_danych.kolejka.KolejkaList;
import pl.sda.struktury_danych.lista.Lista;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	wywolajStosTab();
//        wywolajStosList();
//        wywolajKolejkaList();
//        wywolajONP();
//        wywolajBinarySearch();
//          wywolajsortowanie();
        wywolajLista();

    }

    public static void wywolajLista() {
        Lista lista = new Lista();

        lista.addFirst(3);
        lista.addFirst(2);
        lista.addFirst(1);

        lista.addLast(4);
        lista.addLast(5);

        System.out.println("Peek first " + lista.peekFirst()); //pokazuje element nic nie zmieniajac
        System.out.println("Peek last: " + lista.peekLast());

        lista.show();
        lista.showReverse();

        System.out.println("Czy znajduje się: " + lista.znajdz(1).getValue());

        lista.usun(3);

        lista.show();
        // mozesz wywolac znajdz

//        lista.pollFirst(); //usuwa pierwszy
//        lista.pollLast();
//
//        lista.pollLast();
//        lista.pollLast();
//
//        lista.show();
    }

    public static void wywolajsortowanie() {
                int tab[] = new int[] {1,4,6,8,12,24,26,36,44,56};
                int szukana = 8;
                int indeks;
                indeks = new BinarySearch2().sortuj(tab,szukana);
                System.out.println(indeks);
    }

    public static void wywolajBinarySearch() {
        int tab[] = new int[] {1, 2, 4, 6, 7, 1, 25, 31, 35};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj szukaną wartość");
        int szukana = scanner.nextInt();

        new BinarySearch().run(tab,szukana);
    }

    public static void wywolajONP() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wyrażenie w Odwritnej Notacji Polskiej");
        String wejscie = scanner.nextLine();

        String[] podzial = wejscie.split(" ");
        new ONP().run(podzial);
    }

    public static void wywolajKolejkaList() {
        KolejkaList kolejkaList= new KolejkaList();

        kolejkaList.add(1);
        kolejkaList.add(2);
        kolejkaList.add(3);

        kolejkaList.show();

        System.out.println("peek: " + kolejkaList.peek());
        kolejkaList.poll();
        kolejkaList.poll();

        kolejkaList.show();

        kolejkaList.add(4);
        kolejkaList.add(5);

        kolejkaList.show();

        System.out.println("koniec");
    }

    public static void wywolajStosList() {
        StosList stosList = new StosList();

        stosList.push(1);
        stosList.push(2);
        stosList.push(3);

        stosList.show();

        try {
            stosList.pop();
        } catch (StosListIndexOutException e) {
            System.out.println(e.getMessage());
        }

        stosList.push(4);
        stosList.push(5);

        stosList.show();

        try {
            stosList.pop();
            stosList.pop();
            stosList.pop();
            stosList.pop();
            stosList.pop();
        } catch (StosListIndexOutException e) {
            System.out.println(e.getMessage());
        }

        stosList.show();

        System.out.println("koniec");
    }

    public static void wywolajStosTab() {
        Scanner scanner = new Scanner(System.in);
        int tab[];
        int rozmiar;
        StosTab stosTab;

        System.out.println("Podaj rozmiar tablicy");
        rozmiar = scanner.nextInt();
        tab = new int[rozmiar];
        stosTab = new StosTab(rozmiar);

        System.out.println("Podaj element tablicy");
        while(true) {
            System.out.println("1 - push; 2 - pop; 3 - peek; 4 - show; 0 - wyjście");
            int operacja = scanner.nextInt();

            switch (operacja) {
                case 0:
                    return;
                case 1:
                    System.out.println("Podaj wartość na stos: ");
                    int w = scanner.nextInt();

                    try {
                        stosTab.push(w);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Tablica pełna");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Pop: " + stosTab.pop());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Tablica pusta!");
                    }
                    break;
                case 3:
                    System.out.println("Peek: " + stosTab.peek());
                    break;
                case 4:
                    stosTab.show();
                    break;
            }
        }

    }
}
