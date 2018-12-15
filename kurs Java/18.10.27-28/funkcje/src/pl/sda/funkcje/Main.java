package pl.sda.funkcje;

public class Main {

    public static int dodawanie(int a, int b) {
//        System.out.println(a+b);
        return a + b;
    }

    public static int odejmowanie(int c, int d) {

        return c - d;
    }

    public static float mnożenie(float e, float f) {

        return e * f;
    }

    public static float dzielenie(float g, float h) {

        return g / h;
    }

    public static String powitanie(String imię) {

        return "Witaj: " + imię;
    }

    public static void liczby(float... argumenty) {
        float suma = 0f;
        for (int i = 0; i < argumenty.length; i++) {
            suma += argumenty[i];
            System.out.println(argumenty[i]);
        }
        System.out.println("Suma argumentów to: " + suma);
    }

    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
    public static double PierwiastekKwadratowy(double liczba) {
        return Math.sqrt(liczba);
    }

    //    Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
    public static double Potęga3(double liczba1, double liczba2) {
        return Math.pow(liczba1, liczba2);
    }

    public static boolean TrójkątProstokątny(double a, double b, double c) {

        if (Math.pow(a, 2) + (Math.pow(b, 2)) == (Math.pow(c, 2))) {

            return true;
        } else if ((Math.pow(a, 2) + (Math.pow(c, 2)) == (Math.pow(b, 2)))) {

            return true;
        } else if ((Math.pow(b, 2) + (Math.pow(c, 2)) == (Math.pow(a, 2)))) {

            return true;
        } else {

            return false;
        }
    }

    public static float PotęgaPętla(float a, float b) {

        float wynik = 1.00f;
        for (int i = 0; i < b; i++) {
            wynik = wynik * a;
        }
        return wynik;
    }
//    Funkcja kwadratowa
    public static double[] funkcjakwadratowa(double a, double b, double c) {
        double x1;
        double x2;
        double[] i = new double[2];
        double delta;
        delta = (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("brak miejsc zerowych");
        }
        else  if (delta == 0){
            System.out.println("jedno miejsce zerowe");
            x1 = -b/(2*a);
            i[0] = x1;
        }
        else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            i[0] = x1;
            i[1] = x2;
        }
        return i;
    }

//    Napisz program, który wyświetli nty wyraz ciągu

    public static int Fibonacci (int n) {

        int result = 0;
        int[] table = new int[n];

        if (n==1) {
            result = 0;
        }
        else if (n == 2) {
            result = 1;
        }
        else {
            table[0] = 0;
            table[1] = 1;
            for (int i = 2; i < n; i++) {

                table[i] = table[i - 1] + table[i - 2];
                result = table[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(dodawanie(10, 5));

        System.out.println(odejmowanie(5, 4));

        System.out.println(mnożenie(18.7f, 7.9f));

        System.out.println(dzielenie(6.8f, 35.7f));

        System.out.println(powitanie("Marcelino"));

        liczby(7.876f, 6.987f, 0.897f, 8.097f);

        System.out.println(PierwiastekKwadratowy(4));

        System.out.println(Potęga3(2, 3));

        System.out.println(TrójkątProstokątny(4, 3, 5));

        System.out.println(PotęgaPętla(3.0f, 4.01f));

        double[] a = funkcjakwadratowa(2, -4, 2);
        System.out.println("pierwsze miejsce zerowe funkcji: " + a[0]);
        System.out.println("drugie miejsce zerowe funkcji: " + a[1]);

        System.out.println(Fibonacci(6));
    }

}