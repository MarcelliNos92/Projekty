package pl.sda.parsercsv;


import java.util.*;

public class Statistic {

    private List<RealEstate> realEstates;

    public Statistic(List<RealEstate> realEstates) {
        this.realEstates = realEstates;

    }

    public RealEstate findMax() {
        int max = realEstates.get(0).getPrice();
        RealEstate estate = null;
        for (RealEstate l : realEstates) {
            if (l.getPrice() > max) {
                max = l.getPrice();
                estate = l;
            }
        }
        return estate;
    }

    public double findAvg() {
        double sum = 0;
        for (RealEstate m : realEstates) {
            sum = sum + m.getPrice();
        }
        double average = sum / realEstates.size();

        return average;

    }

    public RealEstate findMin() {
        int min = realEstates.get(0).getPrice();
        RealEstate estate = null;
        for (RealEstate s : realEstates) {
            if (s.getPrice() < min) {
                min = s.getPrice();
                estate = s;
            }
        }
        return estate;

    }

    public void printData(Map<String, List<RealEstate>> stringListMap) {

        for (Map.Entry<String, List<RealEstate>> m : stringListMap.entrySet()) {
            System.out.println("MIASTO: " + m.getKey());
            for(RealEstate estate: m.getValue()){
                System.out.println("Cena: " + estate.getPrice());
                System.out.println("Liczba lazienek: " + estate.getBaths());
            }
            System.out.println("*********============**************");
        }
    }

    public Map<String, List<RealEstate>> listByCity() {

        //mapa w ktorej kluczem jest miasto a wartosciami są pozostałe informacje

        Map<String, List<RealEstate>> map = new HashMap<>();// klucz nazwa miasta
        for (RealEstate estate : realEstates) {
            String key = estate.getCity();
            List<RealEstate> keyList = map.get(key);
            if (keyList != null) {      //aktualizacja
                List<RealEstate> list = map.get(key);
                list.add(estate);
            } else {
                //dodanie pierwszego elementu
                List<RealEstate> list = new ArrayList<>();
                list.add(estate);
                map.put(key, list);
            }
        }

        return map;

//        System.out.println("=====================");
//        System.out.println(map);


//          Set<String> keys = new HashSet<>();

//        for(RealEstate estate: realEstates) {
//            keys.add(estate.getCity());
//        }
//        System.out.println(keys);
//
//        for(String key: keys){
//            for(RealEstate realEstate: realEstates){
//                if(key.equals(realEstate.getCity())){
//                    System.out.println(realEstate);
//                }
//            }
//        }
//
    }
}
