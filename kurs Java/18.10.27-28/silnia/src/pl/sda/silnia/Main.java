package pl.sda.silnia;

public class Main {

    public static void main(String[] args) {

        // SILNIA
        int silnia = 5;
        int wynik = 1;

        for(int i = 1; i <= silnia; i++) {
            wynik = wynik*i;
            System.out.println("Wynik: " + wynik);
            System.out.println("Iteracja numer: " +i);

        }
        System.out.println("Silnia z liczby: " + silnia + " wynosi: " + wynik);

        int a = 54;
        int b = 321;
        int suma = 0;

        //posumować liczby a do b
        for(int i = a; i <= b; i++) {
            suma = suma + i;
            // suma+= i; to samo
        }
        System.out.println("Suma liczb z przedziału: "  + "<"+a+ ","+b+"> wynosi: " + suma);

        //posumować liczby a do b tylko parzyste
        suma = 0;
        for(int i = a; i <= b; i++) {

            if(i%2 == 0 ) {
                suma = suma + i;
            }
        }
        System.out.println("Suma liczb parzystych z przedziału: "  + "<"+a+ ","+b+"> wynosi: " + suma);

//
        System.out.println("nowy kod ");

    }
}
