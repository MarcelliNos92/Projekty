package pl.sda.podstawy;

public class Cat implements Animal {

    @Override
    public void getName() {
        System.out.println("To jest kot");
    }

    @Override
    public void getSound() {
        System.out.println("Dźwiek kota");
    }

    @Override
    public void amountOfFood() {

    }
}
