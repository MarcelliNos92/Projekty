package pl.sda.trojkat;

public class Triangle {

    private int sideA;
    private int sideB;

    public Triangle(int sideA, int sideB) {

        this.sideA = sideA;
        this.sideB = sideB;

    }

    public double getPerimeter() {
        double sideC = 0;
        sideC = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
        double perimeter;
        perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    public double getArea() {
        double area = 0;
        area = sideA*sideB/2;
        return area;
    }

}