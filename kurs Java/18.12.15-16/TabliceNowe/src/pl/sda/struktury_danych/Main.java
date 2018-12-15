package pl.sda.struktury_danych;

public class Main {

    public static void main(String[] args) {

        boolean warunek = Posortowanie.sortuj (new int[] {1,3,5,6,7,8,10,9,16,15});
        System.out.println(warunek);

        Posortowanie.losowe(10);

        Posortowanie.sumaTablic(new int [] {1,4,2,5,17}, new int [] {1,6,2,5,11});
    }
}
