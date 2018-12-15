package pl.sda.car.model;

public class Car {

    private Wheel[] wheels;
    private Body body;
    private Options options;
    private Engine engine;

    public Car(Engine engine, Wheel[] wheels, Body body, Options options) {
        this.wheels = wheels;
        this.body = body;
        this.options = options;
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public Navigation getNavigation() {
        return getOptions().getNavigation();
    }

    public AirConditioner getAirConitioner(){
        return getOptions().getAirconditioner();
    }

    public Airbag getAirbag() {
        return getOptions().getAirbag();
    }
}


