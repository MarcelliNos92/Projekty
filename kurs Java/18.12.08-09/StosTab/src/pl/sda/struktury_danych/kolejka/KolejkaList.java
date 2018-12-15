package pl.sda.struktury_danych.kolejka;


public class KolejkaList {

    KolejkaElem first;
    KolejkaElem last;

    public KolejkaList() {
        first = last = null;
    }

    public void add(int wartosc) {
        KolejkaElem newLastElem = new KolejkaElem(wartosc, null);

        if (first == null) {
            first = last = newLastElem;
        } else {
            last.setNext(newLastElem);
            last = newLastElem;
        }
    }

    public int poll() {
        if(first == null) {
            //TODO exception

        }
        if(first.getNext()== null) {
            last = null;
        }
        int value = first.getValue();
        first = first.getNext();
        return value;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int peek() {
        return first.getValue();

    }

    public void show() {
        KolejkaElem elemTmp = first;

        while (elemTmp != null) {
            System.out.println(elemTmp.getValue() + " ");
            elemTmp = elemTmp.getNext();
        }
        System.out.println();

    }
}
