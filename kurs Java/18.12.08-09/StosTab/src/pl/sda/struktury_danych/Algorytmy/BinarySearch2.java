package pl.sda.struktury_danych.Algorytmy;

public class BinarySearch2 {

    public static int sortuj (int[] A, int szukana) {


        int n = A.length;
        int lewo = 0;
        int prawo = n-1;
        int srodek =0;

        while(prawo > 0){

            srodek = (lewo + prawo)/2;

            if(szukana < A[srodek]) {
                prawo = srodek;
            }
            else if (szukana > A[srodek]) {
                lewo = srodek;
            }
            else{
                szukana = A[srodek];
            }
        }
        return srodek;
    }



}
