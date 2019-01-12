package pl.sda.podstawy;

public class Silnia {

    public static int silnia(int n) {

        if(n < 2) {
            return 1;
        }

        return  n* silnia(n-1);
    }

    public static double ciag(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 0.5;
        }

        return - ciag(n-1) * ciag(n - 2);
    }

    public static int ciag2(int n) {

        if( n == -1) {
            return -1;
        }

        return (n-3) * - ciag2(n-1);
    }

    public static int ciagFib(int n) {

        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        return ciagFib(n-1) + ciagFib(n-2);
    }

    public static void binarnie(int liczba) {

        if(liczba > 0) {
            System.out.println(liczba%2);
            binarnie(liczba/2);
        }
    }

    public static int sumacyfriteracyjnie(int liczba) {

        int suma = 0;
        while( liczba > 0) {

            int cyfra = liczba%10;
            liczba = liczba/10;

            suma = suma + cyfra;
        }
        return suma;
    }

    public static int sumacyfrrekurencyjnie(int liczba){
        int suma = 0;
        if (liczba > 0) {
            int cyfra = liczba % 10;
            System.out.println(cyfra);
            suma = sumacyfrrekurencyjnie(liczba / 10) + cyfra;
        }
        return suma;
    }
}
