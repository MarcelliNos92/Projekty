package pl.sda.struktury_danych.Algorytmy;

import pl.sda.struktury_danych.StosTab;

public class ONP {

    public void run(String tab[]) {
        StosTab stosTab = new StosTab(tab.length);
        for(int i = 0; i < tab.length; i++) {
            try {
                int wartosc = Integer.parseInt(tab[i]);
                stosTab.push(wartosc);

            } catch (NumberFormatException e) {
                int wartosc1 = stosTab.pop(); //zdejmnij wartosc ze stosu
                int wartosc2 = stosTab.pop();
                System.out.println("test: " + wartosc1 + " " + wartosc2);

                String operacja = tab[i];

                int wynik = 0;
                if(operacja.equals("+")) {
                   wynik = wartosc2 + wartosc1;
                }else if (operacja.equals("-")) {
                    wynik = wartosc2 - wartosc1;
                }else if(operacja.equals("*")){
                    wynik = wartosc2 * wartosc1;
                }else if(operacja.equals("/")){
                    wynik = wartosc2 / wartosc1;
                } else {
                    return;
                }

                //wynik dodaj na stos
                stosTab.push(wynik);
            }
        }

        System.out.println(stosTab.pop());
    }
}
