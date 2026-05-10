package Exercise10_11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D(){
        x = 0.0;
        y = 0.0;
        radius = 1.0;
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y){
        return Math.pow((x - getX()), 2) + Math.pow((y - getY()), 2) <= Math.pow(getRadius(), 2);
    }

    public boolean contains(Circle2D circle){
        double distanceBetweenCenters = Math.sqrt(Math.pow(circle.getX() - getX(), 2) + Math.pow(circle.getY() - getY(), 2));

        return circle.getRadius() + distanceBetweenCenters <= this.getRadius();
    }

    public boolean overlaps(Circle2D circle){
        double distanceBetweenCenters = Math.sqrt(Math.pow(circle.getX() - getX(), 2) + Math.pow(circle.getY() - getY(), 2));

        return distanceBetweenCenters <= this.getRadius() + circle.getRadius();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}
