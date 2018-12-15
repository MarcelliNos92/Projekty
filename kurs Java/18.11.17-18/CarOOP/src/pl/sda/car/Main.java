package pl.sda.car;


import pl.sda.car.model.*;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(new Engine(), Wheel.fourWheels(), new Body(), new Options());

    }
}
