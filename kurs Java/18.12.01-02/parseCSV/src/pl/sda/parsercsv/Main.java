package pl.sda.parsercsv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

       Statistic statistic = new Statistic(Parser.readFile());
       RealEstate realEstate = statistic.findMax();
        System.out.println(realEstate);

        double realEstateAvg = statistic.findAvg();
        System.out.println(realEstateAvg);
        RealEstate realEstateMin = statistic.findMin();
        System.out.println(realEstateMin);



        Map<String, List<Integer>> map = new HashMap<>();// aktualizacja mapy

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(1);

        List<Integer> integerList1 = new ArrayList<>();
        integerList.add(3);
        integerList.add(4);

        map.put("klucz1", integerList);
        List<Integer> listFromMap = map.get("klucz1");
        listFromMap.addAll(integerList1);

        map.put("klucz1", listFromMap);

        System.out.println(map);
        statistic.printData(statistic.listByCity());


    }
}
