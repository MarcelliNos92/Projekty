package pl.sda.lekarstwa.model;

public class Lekarstwa {

    private String[] nazwa;
    private double[] cena;
    private double[] refundacja;

    public Lekarstwa(String[] nazwa, double[] cena, double[] refundacja) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.refundacja = refundacja;

    }

    public void iteruj() {

        for (int i = 0; i < nazwa.length; i++) {
            System.out.println(nazwa[i]);
            System.out.println(cena[i]);
            System.out.println(refundacja[i]);
        }
    }

    double cena(String lek, boolean ubezpieczony) {
        int index = 0;
        for (int i = 0; i < nazwa.length; i++) {
            if (nazwa[i].equals(lek)) {
                index = i;
            }
        }
        System.out.println("Lek " + lek + " index: " + index);

        if (ubezpieczony == true) {
            double cenaref = this.cena[index] - this.cena[index] * this.refundacja[index];
            System.out.println("Cena po refundacji: " + cenaref);
            return cenaref;
        } else {

            System.out.println("Cena bez refundacji: " + this.cena[index]);
            return this.cena[index];
        }
    }

    String maksymalnaRefundacja() {
        int indexMax = 0;
        double[] cenaRef = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < nazwa.length; i++) {
            cenaRef[i] = this.cena[i] * this.refundacja[i];
            System.out.println("cena zrefundowana: " + this.nazwa[i] + " to " + cenaRef[i]);
            if (cenaRef[i] > cenaRef[indexMax]) {
                indexMax = i;
            }
        }
        System.out.println("Lek o największej refundacji to: " + this.nazwa[indexMax]);
        return "Lek o największej refundacji to: " + this.nazwa[indexMax];
    }

    double kosztCalkowity() {
        double suma = 0;
        for(int i = 0; i < nazwa.length; i++){
            suma = suma + cena[i];
        }
        System.out.println("Koszt całkowity: " + suma);
        return suma;
    }

    void wyswietl(String lek) {
        int index = 0;
        for (int i = 0; i < nazwa.length; i++) {
            if (nazwa[i].equals(lek)) {
                index = i;
            }
        }
        System.out.println("Nazwa leku: "+ this.nazwa[index]);
        kosztCalkowity();
        System.out.println("Procent refundacji " + this.refundacja[index]);
    }

    public double zamowienie(int[] zamowienia, boolean[] refundacje) {
        double sumaCal = 0;
        double sumaRef = 0;
        double sumaNieRef = 0;
        for (int i = 0; i < zamowienia.length; i++) {
            if (refundacje[i] == true) {
                System.out.println("Lek zrefundowany: " + this.nazwa[zamowienia[i]]);
                sumaRef = sumaRef + (this.cena[zamowienia[i]] - (this.cena[zamowienia[i]] * this.refundacja[zamowienia[i]]));
            }
            else if(refundacje[i] == false) {
                System.out.println("Lek niezrefundowany: " + this.nazwa[zamowienia[i]]);
                sumaNieRef = sumaNieRef + this.cena[zamowienia[i]];
            }
        }
        System.out.printf("Suma zrefundowanych leków to: " + "%2.2f.", sumaRef);
        System.out.println();
        System.out.printf("Suma niezrefundowanych leków to: " + "%2.2f.", sumaNieRef);
        System.out.println();
        sumaCal = sumaRef + sumaNieRef;
        return sumaCal;
    }
}
