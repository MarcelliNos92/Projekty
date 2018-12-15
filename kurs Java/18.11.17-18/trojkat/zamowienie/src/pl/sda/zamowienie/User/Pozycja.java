package pl.sda.zamowienie.User;

public class Pozycja {

    String nazwaTowaru;
    int ileSztuk;
    double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;

    }

    public double obliczWartosc(int ileSztuk, double cena) {
        double wartosc;
        wartosc = ileSztuk*cena;
        return  wartosc;
    }


}
