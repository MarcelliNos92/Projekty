package pl.sda.zamowienie.model;

public class Zamowienie {

    private Pozycja[] pozycje;
    private  int ileDodanych;
    private  int maksRozmiar;

    public Zamowienie() {
        this.maksRozmiar = 10;
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }

    public void setMaksRozmiar(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }

    public int getMaksRozmiar() {
        return maksRozmiar;
    }

    public void dodajPozycje(Pozycja p) { // czy dodawanie pozycji jest poprawne?
        this.ileDodanych = 0;
        pozycje[this.ileDodanych] = p;
        ileDodanych = ileDodanych + 1;
    }
    public double obliczWartosc() {
            double wartosc = 0;
        for (int i = 0; i < ileDodanych; i++) {
            wartosc = wartosc + pozycje[i].obliczWartosc();
        }
        return  wartosc;
    }

    @Override
    public String toString() {
        for(int i = 0; i< ileDodanych; i++) { //jak wyświetlić ciąg wartości z klasy pozycja oraz  wartość zamówienia
            pozycje[i].toString();
        }
        return " Razem " + obliczWartosc() + " zł";
    }
}
