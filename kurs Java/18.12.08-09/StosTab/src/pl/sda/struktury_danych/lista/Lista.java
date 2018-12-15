package pl.sda.struktury_danych.lista;

public class Lista {

    private ListaElem first; //head
    private ListaElem last; //tail

    public  Lista() {
        first = last = null;
    }

    public void addFirst(int wartosc) {
        ListaElem newListElem = new ListaElem(wartosc);

        if(first == null) {
            first = last = newListElem;
        }
        else {
            first.setPrev(newListElem);
            newListElem.setNext(first);
            first = newListElem;
        }

    }

    public void addLast(int wartosc) {
        ListaElem newListElem = new ListaElem(wartosc);

        if(first == null){
            first = last = newListElem;
        }
        else {
            last.setNext(newListElem);
            newListElem.setPrev(last); //informacja o poprzedniku
            last = newListElem;
        }
    }

    public int peekFirst() {
        return first.getValue();
    }

    public int peekLast() {
        return last.getValue();
    }

    public int pollFirst() {
        if(first == null) {
            // todo exception
        }

        if(first.getNext() == null) {
            last = null;
        }

        int value = first.getValue();
        first = first.getNext();

        if(first != null){
            first.setPrev(null);
        }

        return value;
    }

    public int pollLast() {
        if(last == null) {
            //TODO exception
        }

        if(last.getPrev() == null) {
            first = null;
        }

        int value = last.getValue();
        last = last.getPrev();

        if(last != null) {
            last.setNext(null);
        }

        return value;
    }

    public  void show() {
        ListaElem listaElemTmp = first;

        while(listaElemTmp != null) {
            System.out.print(listaElemTmp.getValue()+ " ");
            listaElemTmp = listaElemTmp.getNext();
        }
        System.out.println();
    }

    public void showReverse() {
        ListaElem listaElemTmp = last;

        while(listaElemTmp !=null) {
            System.out.print(listaElemTmp.getValue() + " ");
            listaElemTmp = listaElemTmp.getPrev();
        }
    }

    public ListaElem znajdz(int wartosc) {
        ListaElem listaElemTmp = first;

        while(listaElemTmp != null) {
            if(listaElemTmp.getValue() == wartosc){
                return  listaElemTmp;
            }
            listaElemTmp = listaElemTmp.getNext();
        }
        return null;
    }

    public boolean usun(int wartosc) {
        ListaElem szukanyElemen = znajdz(wartosc);

        if(szukanyElemen == null) {
            return false;
        }
        else if(wartosc == first.getValue()) {
            pollFirst();
        }
        else if ( wartosc == last.getValue()){
            pollLast();
        }
        else {
            szukanyElemen.getPrev().setNext(szukanyElemen.getNext()); //modyfikujemy wskazniki
            szukanyElemen.getNext().setPrev(szukanyElemen.getPrev());
        }
            return true;
    }
}
