package pl.sda.lista;

public class Lista {

    private int[] liczby;
    private int pojemnosc;
    private int rozmiar;

    Lista(int pojemnosc) {

        this.liczby = new int[pojemnosc];
        this.rozmiar = 0;
        this.pojemnosc = pojemnosc;
    }

    public void dodajElement (int element){
        if(rozmiar == pojemnosc) {
            System.out.println("Lista jest pelna");
        }
        else {
            liczby[rozmiar] = element;
            rozmiar++;
        }
    }
}
