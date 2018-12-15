package pl.sda.podstawy;

public class Dog implements Animal {

    @Override
    public void getName() {
        System.out.println(" To jest pies");
    }

    @Override
    public void getSound() {
        System.out.println("dźwięk psa");
    }

    @Override
    public void amountOfFood() {

    }
}
