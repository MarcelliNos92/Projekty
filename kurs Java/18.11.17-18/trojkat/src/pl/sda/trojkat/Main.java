package pl.sda.trojkat;

public class Main {

    public static void main(String[] args) {

        Triangle tri = new Triangle(10, 15);
        System.out.println(tri.getPerimeter());
        System.out.println(tri.getArea());
        Circle cir = new Circle(10);
        System.out.println(cir.getArea());
    }

}