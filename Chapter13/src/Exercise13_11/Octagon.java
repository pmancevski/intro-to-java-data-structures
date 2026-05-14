package Exercise13_11;

import utils.GeometricObject;

public class Octagon extends GeometricObject implements Cloneable {
    private double side;

    public Octagon(){
        side = 1;
    }

    public Octagon(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public double getArea() {
        return (2 + 4 * Math.sqrt(2)) * side * side;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
