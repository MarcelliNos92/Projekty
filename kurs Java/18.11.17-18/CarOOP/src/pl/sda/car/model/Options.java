package pl.sda.car.model;

public class Options {

    private Navigation navigation;
    private AirConditioner airconditioner;
    private  Airbag airbag;

    public Options() {
    }

    public Options(Navigation navigation, AirConditioner airconditioner, Airbag airbag) {
        this.navigation = navigation;
        this.airconditioner = airconditioner;
        this.airbag = airbag;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    public AirConditioner getAirconditioner() {
        return airconditioner;
    }

    public void setAirconditioner(AirConditioner airconditioner) {
        this.airconditioner = airconditioner;
    }

    public Airbag getAirbag() {
        return airbag;
    }

    public void setAirbag(Airbag airbag) {
        this.airbag = airbag;
    }
}
