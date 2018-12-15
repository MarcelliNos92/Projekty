package pl.sda.parsercsv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    // zczytać z pliku dane i zapisać je w liscie

    public static Path file = Paths.get("estate_tmp.csv");

    public static List<RealEstate> readFile() {

        // tworzę listę typu RealEstate
        // z każdej linii tworzę obiekt RealEstate
        // utworzony obiekt dodaję na liste

        List<RealEstate> realEstateList = new ArrayList<>();

        int max = 0;
        int pozycja = 0;
        try {
            List<String> lines = Files.readAllLines(file); //przypisujemy do listy stringów
            lines.remove(0); //nie chcemy nagłowka
            for(String l: lines) {
               String[] line = l.split(",");
               RealEstate realEstate = new RealEstate(line[0], line[1], Integer.parseInt(line[2]), line[3], Integer.parseInt(line[4]), Integer.parseInt(line[5]), Integer.parseInt(line[6]),line[7], line[8], Integer.parseInt(line[9]),Float.parseFloat(line[10]), Float.parseFloat(line[11]));
               realEstateList.add(realEstate);
            }
            System.out.println(realEstateList);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        for(int i = 0; i < realEstateList.size(); i++) {// znajduje max price
//            if(max < realEstateList.get(i).getPrice()){
//                max = realEstateList.get(i).getPrice();
//                pozycja = i;
//            }
//
//        }
//        System.out.println(realEstateList.get(pozycja));

        return realEstateList;
    }


}
