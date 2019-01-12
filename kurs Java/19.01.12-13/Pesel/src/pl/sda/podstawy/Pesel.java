package pl.sda.podstawy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Pesel {

    private static Path path = Paths.get("pesel.txt");

    public void checkPesel() {

        int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

        try {
            List<String> peselList = Files.readAllLines(path);
            for (String pesel : peselList) {
                System.out.println(pesel);
            }
            List<Integer> sumaKontrolna = sumaKontrolna(peselList,wagi);
            for (Integer suma : sumaKontrolna){
                System.out.println(suma);
            }
            cyfraKontrolna(sumaKontrolna, ostatniaCyfra(peselList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> sumaKontrolna(List<String> peselList, int[] wagi) {
        int suma = 0;
        int iloczyn = 0;
        ArrayList<Integer> sumaKontrolna = new ArrayList<Integer>();
        for (String pesel : peselList) {
            for (int i = 0; i < pesel.length()-1; i++) {
                int a = (pesel.charAt(i)- 48);
                iloczyn = (pesel.charAt(i)-48) * wagi[i];
                suma = suma + iloczyn;
            }
            sumaKontrolna.add(suma);
            suma = 0;
        }
        return sumaKontrolna;
    }
    public static List<Integer> ostatniaCyfra(List<String> peselList) {
        ArrayList<Integer> ostatniaCyfra = new ArrayList<Integer>();
        for (String pesel : peselList) {
            int a = (pesel.charAt(10) - 48);
            ostatniaCyfra.add(a);
        }
        return ostatniaCyfra;
    }

    public static List<Integer> cyfraKontrolna(List<Integer> SumaKontrolna, List<Integer> ostatniaCyfra){

        int indeks = 0;
        int reszta = 0;
        ArrayList<Integer> blednyPeselindeks = new ArrayList<Integer>();

        for (Integer suma : SumaKontrolna){
            reszta = suma%10;
            int a = ostatniaCyfra.get(indeks);
            if(reszta == a){
                System.out.println("Poprawny nr pesel o indeksie: " + indeks);
            }
            else if((10-reszta) == a){
                System.out.println("Poprawny nr pesel o indeksie: " + indeks);
            }
            else{
                System.out.println("Niepoprawny nr pesel o indeksie: " + indeks);
                blednyPeselindeks.add(indeks);
            }
            indeks++;
        }
        return blednyPeselindeks;
    }
}


