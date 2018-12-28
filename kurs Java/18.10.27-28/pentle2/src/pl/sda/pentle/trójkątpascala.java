package pl.sda.pentle;

public class trójkątpascala {

    public static void wydruk(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                if(j < (n - i + 5 )){
                    System.out.print(" ");
                }
                else {
                    System.out.print("1 ");
                }

            }
            System.out.println("");
        }
    }
}
