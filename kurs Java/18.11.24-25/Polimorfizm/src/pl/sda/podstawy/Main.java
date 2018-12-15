package pl.sda.podstawy;

public class Main {

    public static void main(String[] args) {


        Animal cat = new Cat();
        cat.getName();

        Animal dog = new Dog();
        dog.getSound();

        AnimalClass dogClass = new DogClass();
        dogClass.sound();
    }
}
