package pl.sda.podstawy;

public class Lista {

    private int[] liczby;
    private int pojemnosc;
    private int rozmiar;

    public Lista(int[] liczby, int pojemnosc, int rozmiar) {
        this.liczby = liczby;
        this.pojemnosc = pojemnosc;
        this.rozmiar = rozmiar;
    }

    public void dodajElement(int liczba) throws ArrayIndexOutOfBoundsException {

        this.liczby[this.rozmiar] = liczba;

        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("Is full");
        }
    }

    public boolean isFull() {
        this.rozmiar = this.pojemnosc;

        return true;
    }

    public int znajdz(int szukana) {
        for (int i = 0; i < this.rozmiar; i++) {
            if (this.liczby[i] == szukana) {

                return i;
            }
        }
        return -1;
    }

}

