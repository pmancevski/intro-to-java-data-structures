package Exercise13_6;

import utils.GeometricObject;

public class App {
    public static void main(String[] args) {

        // Compare two circles
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(7);
        ComparableCircle largerCircle = (ComparableCircle) GeometricObject.max(c1, c2);
        System.out.println("Larger circle area: " + largerCircle.getArea());
    }
}
