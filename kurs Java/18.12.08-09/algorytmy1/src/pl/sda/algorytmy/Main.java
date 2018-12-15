package pl.sda.algorytmy;

public class Main {

    public static void main(String[] args) {
	// data jest tablica liczb calkowitych, wypisz wszystkie liczby od końca bedace na parzystych indeksach

        int suma = 0;
        int [] tab = new int [100];
        for(int i = tab.length-1; i >= 0; i--) {
            if(i % 2 == 0) {
                System.out.println(tab[i]);
            }

            if(tab[i] % 3 == 0) {
                suma = suma + tab[1];
                System.out.println(suma);
            }
        }
    }
}
