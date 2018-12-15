package pl.sda.generyki;

public class Box <T> {
    private T fruit;

    public Box(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }

}
