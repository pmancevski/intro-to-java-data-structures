package Exercise13_6;

import utils.Circle;
import utils.GeometricObject;

//didnt override compareTo because that method is implemented in GeometricObject (by area)
public class ComparableCircle extends Circle implements Comparable<GeometricObject> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
}
