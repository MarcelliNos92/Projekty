package pl.sda.struktury_danych;

import java.util.Random;

public class Posortowanie {

    public static boolean sortuj(int [] tab) {

        for(int i = 0; i < tab.length - 1; i++) {

            if(tab[i+1] > tab[i]) {
                System.out.println(tab[i+1] + "jest wieksze" + tab[i]);
            }
            else{
                System.out.println("warunek niespełniowny");
                return false;
            }
        }
        return true;
    }

    public static void losowe(int rozmiar) {

        int [] tab = new int[rozmiar];
        Random random = new Random();

        for(int i = 0; i < rozmiar - 1; i++) {

            int min = -100;
            int max = 100;
            tab[i] = random.nextInt(max - min)+ min;
            System.out.println(tab[i]);
        }
    }

    public static void sumaTablic(int [] tab1, int [] tab2) {

        int [] tab3 = new int[tab1.length];

        for(int i = 0; i < tab1.length; i++) {

            tab3[i] = tab1[i] + tab2[i];
            System.out.println(tab3[i]);
        }
    }
}
