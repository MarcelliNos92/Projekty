package pl.sda.trojkat;

public class Circle implements Figure{

    private int radius;

    public Circle (int radius){

        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double pole = 0;
        pole = Math.PI*Math.pow(getRadius(),2);
        return pole;
    }
    @Override
    public double getPerimeter(){
        double obwod = 0;
        obwod = 2*Math.PI*getRadius();
        return obwod;
    }
}
