package pl.sda.pentle;

public class trójkątpascala {

    public static void wydruk(int n) {



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                System.out.print(" X");
            }
            System.out.println("");
        }

    }
}
