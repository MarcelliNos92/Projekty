package pl.sda.car.model;

public class Wheel {

    public static Wheel[] fourWheels() {

        Wheel wheel[] = new Wheel[4];
        wheel[0] = new Wheel();
        wheel[1] = new Wheel();
        wheel[2] = new Wheel();
        wheel[3] = new Wheel();

        //return wheel;

        return new Wheel[]{new Wheel(), new Wheel(), new Wheel(), new Wheel()};
    }

}
