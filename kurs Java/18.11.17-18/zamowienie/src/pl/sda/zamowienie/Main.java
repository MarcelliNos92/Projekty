package pl.sda.zamowienie;

import pl.sda.zamowienie.model.Pozycja;
import pl.sda.zamowienie.model.Zamowienie;

public class Main {

    public static void main(String[] args) {


        Pozycja p1 = new Pozycja("Sól", 2, 3.40);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        System.out.println(p2);

        Zamowienie z = new Zamowienie(20);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);
        System.out.println(z.toString());

    }
}
