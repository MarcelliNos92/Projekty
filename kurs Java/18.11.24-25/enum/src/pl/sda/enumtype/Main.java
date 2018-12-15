package pl.sda.enumtype;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(Telephone.LENOVO.getPopular());
//                1. zapytać uzytkownika o markę
//                2. za pomocą switch case wyświetlić popularność telefonu

        System.out.println("Podaj markę: ");
        Scanner wejscie = new Scanner(System.in);
        String marka = wejscie.nextLine();
        marka = marka.toUpperCase();

//        dłuższa metoda
//       int popular = 0;
//        switch (marka) {
//            case "SAMSUNG":
//                popular = Telephone.SAMSUNG.getPopular();
//                break;
//            case "LG":
//                popular = Telephone.LG.getPopular();
//                break;
//            case "IPHONE":
//                popular = Telephone.IPHONE.getPopular();
//                break;
//            case "LENOVO":
//                popular = Telephone.LENOVO.getPopular();
//                break;
//            case "NOKIA":
//                popular = Telephone.NOKIA.getPopular();
//                break;
//        }
//        System.out.println("Popularność to: " + popular);

        switch (marka) {
            case "SAMSUNG":
                showTelephone(Telephone.SAMSUNG);
                break;
            case "LG":
                showTelephone(Telephone.LG);
                break;
            case "IPHONE":
                showTelephone(Telephone.IPHONE);
                break;
            case "LENOVO":
                showTelephone(Telephone.LENOVO);
                break;
            case "NOKIA":
                showTelephone(Telephone.NOKIA);
                break;
        }
    }

    private static void showTelephone(Telephone telephone) {
        System.out.println("Wybrana marka to: " + telephone + " jej popularnosc to: " + telephone.getPopular());
    }
}
