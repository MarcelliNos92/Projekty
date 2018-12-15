package pl.sda.generyki;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class SetExample {

    public static  void example(){

        //kolekcja
        Set<Integer> integerSet = new HashSet<>();
        int[] array = {11, 22,33,44,55,66,78,90,90,44,33};

        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(2);

        Set<Integer> integerSet1 = new HashSet<>();

        for(int a: array){
            integerSet1.add(a);
        }

        System.out.println(integerSet1);

    }
        public static void mapExample() {

        Map<String, List<Integer>> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        map.put("klucz1", list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(223);

        map.put("klucz2", list1);
            System.out.println(map.entrySet());

            for(Map.Entry<String, List<Integer>> entry: map.entrySet()) {
                System.out.println("Klucz: " + entry.getKey());
                System.out.println("Wartosc: " + entry.getValue());
            }

            Iterator<Map.Entry<String, List<Integer>>> it = map.entrySet().iterator();

            System.out.println("=====");
            while(it.hasNext()){
                Map.Entry<String, List<Integer>> pair = it.next();
                System.out.println(pair.getKey() + " wartosc: " + pair.getValue());
                for(Integer i: pair.getValue()) {
                    System.out.println(i);
                }
            }
        }

}

