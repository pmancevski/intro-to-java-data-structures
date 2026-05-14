package Exercise13_1;

import utils.GeometricObjectOld;

public class Triangle extends GeometricObjectOld {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle(String color, boolean filled) {
        super(color, filled);
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea: " + getArea() + " Perimeter: " + getPerimeter();
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }


}
