package pl.sda.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        try {
//            PrintWriter printWriter = new PrintWriter("plik.txt");

            PrintWriter printWriter = new PrintWriter( new FileOutputStream(new File("plik.txt"),true ) ); // nowa linia

            for(int i = 0; i < 1000; i++) {
                printWriter.print("zapis...");
            }
            printWriter.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


//        NewFile.testWrite();
//        NewFile.prepareData();
        NewFile.readFile();
    }

    public static  void readFile(){
        File file = new  File("Plik.txt");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String linia = scanner.nextLine();
        System.out.println(linia);

        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

    }



}
