package pl.sda.generyki;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//typy generyczne
public class Main {

    public static void main(String[] args) {
        // write your code here

        //do klasy Box przekazujemy obiekty
        // <> nawiasy diamentowe

        Box<Apple> appleBox = new Box<>(new Apple("PL"));
        Box<Orange> orangeBox = new Box<>(new Orange("US")); //(new Orange ()) -konstruktor

        System.out.println(appleBox.getFruit().getName());
        System.out.println(orangeBox.getFruit().getName());

        // listy dynamiczne, rozszerzająs ie z napływem danych;
        //tworzę istę, w nawiasach zadeklarować typ listy, np String
        //musimy zaimportować alt+Enter
        //z prawej strony musimy zaimplementować to, czego chcemy użyć
        //ArrayList ma ten am typ co po lewej


        List<String> stringList = new ArrayList<>();
        //dodajemy Stringi do listy
        stringList.add("Jan");
        stringList.add("Marcin");
        stringList.add("Ola");
        stringList.add("Michał");

        for (String s: stringList) {
            System.out.println(s);
        }
//==================================================================================

//        List<List<String>> stringList2 = new ArrayList<>();
//
//        List<String> a = new ArrayList<>();
//        a.add("test");
//        a.add("Dwa");
//
//        List<String> b = new ArrayList<>();
//        b.add("trzy");
//        b.add("cztery");
//
//        stringList2.add(a);
//        stringList2.add(b);

        List<List<List<String>>> stringList2 = new ArrayList<>();
        List<List<String>> one = new ArrayList<>();
        List<String> a = new ArrayList<>();
        a.add("test");
        a.add("Dwa");

        List<List<String>> aList = new ArrayList<>();
        aList.add(a);


        List<String> b = new ArrayList<>();
        b.add("trzy");
        b.add("cztery");

        List<List<String>> bList = new ArrayList<>();
        aList.add(b);

        stringList2.add(aList);
        stringList2.add(bList);

        a.remove(0);
        a.clear();
        System.out.println(a.size()); //rozmiar
//        System.out.println(a.get(1)); //konkretny element

        for(String lista: a) {
            System.out.println(lista);
        }

        Random random = new Random();
        random.setSeed(0); //wylosuje te same liczby za każdym razem
        List<Integer> integerList = new ArrayList<>();
        for(int i =0; i< 5; i++){
            integerList.add(random.nextInt() % 100); // zakres 100
//            System.out.println(random.nextInt() % 10);
        }
        System.out.println(integerList);

        for(int i =0; i < integerList.size(); i++) {

            if(i % 2 != 0) {
                System.out.println(integerList.get(i));
            }
        }

        List<Integer> row1 = new ArrayList<>(); //macierz
        List<Integer> row2 = new ArrayList<>();
        List<Integer> row3 = new ArrayList<>();

        row1.add(2);
        row1.add(1);
        row1.add(7);

        row2.add(-1);
        row2.add(4);
        row2.add(2);

        row3.add(3);
        row3.add(0);
        row3.add(3);

        //pakowanie wierszy do jednej struktury za pomocą listy list
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(row1);
        lists.add(row2);
        lists.add(row3);
        // nowa macierz
        List<Integer> m2r1 = new ArrayList<>();
        List<Integer> m2r2 = new ArrayList<>();
        List<Integer> m2r3 = new ArrayList<>();
        // definiowanie elementów
        m2r1.add(2);
        m2r1.add(3);
        m2r1.add(4);

        m2r2.add(5);
        m2r2.add(10);
        m2r2.add(21);

        m2r3.add(-2);
        m2r3.add(32);
        m2r3.add(21);

        // stwórz listę list, są 2 wymiary więc potrzeba 2 pętli, zeby się przeiterować

        List<List<Integer>> matrix2 = new ArrayList<>();
        matrix2.add(m2r1);
        matrix2.add(m2r2);
        matrix2.add(m2r3);

        System.out.println(lists);
        System.out.println(matrix2);


//        dodaj elementy jednej macierzy do drugiej

        int [][] macierz = new int [3][3];
        int wynik = 0;
        for(int i = 0; i < lists.size(); i++ ){

            for(int j = 0; j < lists.size(); j++ ){
                wynik = lists.get(i).get(j) + matrix2.get(i).get(j);
                macierz[i][j] = wynik;
                System.out.print(macierz[i][j]+ " ");
            }
            System.out.println();
        }
        SetExample.example();
        SetExample.mapExample();

    }
}