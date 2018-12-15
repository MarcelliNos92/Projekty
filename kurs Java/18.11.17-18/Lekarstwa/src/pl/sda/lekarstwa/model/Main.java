package pl.sda.lekarstwa.model;

import pl.sda.lekarstwa.model.Lekarstwa;

public class Main {

    public static void main(String[] args) {

        String[] leki = {"apap", "ibuprom", "lek3", "lek4", "lek5", "lek6", "lek7", "lek8", "lek9", "lek10"};
        double[] cena = {22.21, 23.43, 100.23, 2, 4.1, 54.2, 32.22, 88.90, 23.32, 99.11};
        double[] refundacja = {0.2, 0.1, 0.6, 0.3, 0.1, 0.23, 0.8, 0.33, 0.21, 0.44};

        int[] zamowienie_index = {2, 7, 1, 8, 0, 4};
        boolean[] zamowienie_refundacje = {true, false, true, true, false, true};


        Lekarstwa lekarstwa = new Lekarstwa(leki, cena, refundacja);
        lekarstwa.iteruj();
        lekarstwa.cena("ibuprom", true);
        lekarstwa.maksymalnaRefundacja();
        lekarstwa.kosztCalkowity();
        lekarstwa.wyswietl("apap");
        System.out.println(lekarstwa.zamowienie(zamowienie_index, zamowienie_refundacje));


    }
}
