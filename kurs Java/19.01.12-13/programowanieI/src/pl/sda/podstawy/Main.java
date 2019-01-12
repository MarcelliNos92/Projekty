package pl.sda.podstawy;

public class Main {

    public static void main(String[] args) {

      Silnia s = new Silnia();
        System.out.println(s.silnia(5));
        System.out.println(s.ciag(5));
        System.out.println(s.ciagFib(5));
//        s.binarnie(5);
//        System.out.println(s.sumacyfriteracyjnie(123));
        System.out.println(s.sumacyfrrekurencyjnie(1234));

        int tab[] = {1,2,3,4,5,6,7,8};
        // 2 1 4 3
        // int tmp = tab[1];
        // tab[1] = tab[1+1];
        //tab[2] = tmp;

        //zamienianie elementów miejscami

        for(int i = 0; i<tab.length; i++) {

            int tmp = tab[i];
            tab[i] = tab[i+1];
            tab[i+1] = tmp;

            i++;
        }

        int suma = 0;
        int silnia = 1;
        for(int i = 0; i<tab.length; i++) {

            suma = suma + tab[i];
            silnia = silnia*tab[i];
        }
        System.out.println(silnia);


        tab[0] = 0;
        tab[1] = 1;
        for(int i = 2; i < tab.length; i++) {

            tab[i] = tab[i-2] + tab[i-1];

        }

        System.out.println(tab[6]);
    }
}
