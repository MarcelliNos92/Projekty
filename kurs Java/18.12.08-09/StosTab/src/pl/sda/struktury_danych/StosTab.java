package pl.sda.struktury_danych;

public class StosTab {

    private int tab[];
    private int top;

    public StosTab(int rozmiar) {
        tab = new int[rozmiar];
        top = -1;
    }

    public void push (int wartosc) throws ArrayIndexOutOfBoundsException{
        //wersja I
//        top = top + 1; //top++
//        tab[top] = wartosc;

        //wersja II
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException();
        }
        tab[++top] = wartosc; //preincrementacja najpierw zwiększamy indeks a potem odwołujemy się do tablicy
    }

    public int pop() throws ArrayIndexOutOfBoundsException{
        //wersja I
//        return tab[top];
//        top = top - 1; //top--
        //wersja II
        if(isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return tab[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        return tab[top];
    }

    public void show() {
        for(int i = 0; i <= top; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return top == tab.length - 1;
    }
}
