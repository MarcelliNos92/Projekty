package pl.sda.distance;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point p) {
        double disX = p.getX() - getX();
        double disY= p.getY() - getY();
        double disXY = Math.sqrt(Math.pow(disX,2)+ Math.pow(disY,2));
        return disXY;
    }

}