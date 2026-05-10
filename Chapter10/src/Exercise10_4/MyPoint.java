package Exercise10_4;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public static double distance(MyPoint point1, MyPoint point2) {
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
