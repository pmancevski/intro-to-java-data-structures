package Exercise13_7;

import utils.GeometricObject;

public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square(){
        side = 0;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
