package pl.sda.car;

        import pl.sda.car.model.User;

public class Main {

    public static void main(String[] args) {

        User Car1 = new User ("BMW", 22323, "V8", 300);
        System.out.println(Car1.getEngine());
        Car1.setPrice(400000.70);
        System.out.println(Car1.getPrice());
        User Car2 = new User ("Mazda", 232243, "RX", 344);
        System.out.println(Car2.getModel());
        System.out.println(Car2.getPrice());
        System.out.println(Car2.getEngine());
        System.out.println(Car2.getSpeed());
    }
}
