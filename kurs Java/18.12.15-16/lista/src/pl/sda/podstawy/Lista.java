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

    public static void dodajElement(int liczba)
//            throws ArrayIndexOutOfBoundsException
    {

        liczby[rozmiar] = liczba;
        rozmiar = rozmiar + 1;

//        if (isFull()) {
//            throw new ArrayIndexOutOfBoundsException("Is full");
//        }
    }

    public boolean isFull() {
        rozmiar = pojemnosc;

        return true;
    }

    public static int znajdz(int szukana) {
        for (int i = 0; i < this.rozmiar; i++) {
            if (liczby[i] == szukana) {

                return i;
            }
        }
        return -1;
    }

    public static void pisz() {
        System.out.println("Rozmiar: " + rozmiar);
        System.out.println("Pojemność: " + pojemnosc);

        for(int i = 0; i < rozmiar; i++){
            System.out.println(liczby[i]);
        }

    }

    public int[] getLiczby() {
        return liczby;
    }

    public void setLiczby(int[] liczby) {
        this.liczby = liczby;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }
}

