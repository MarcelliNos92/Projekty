package pl.sda.zamowienie.model;

public class Pozycja {

    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public double obliczWartosc() {
        double wartosc;
        wartosc = this.ileSztuk*this.cena;
        return wartosc;
    }

    @Override
    public String toString() {
        double a = obliczWartosc();
        return nazwaTowaru + "     " + cena +" zł  "+ ileSztuk +
                " szt.  " + "    " + a + " zł";
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public int getIleSztuk() {
        return ileSztuk;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
