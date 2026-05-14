package Exercise13_12;

import utils.Circle;
import utils.GeometricObject;
import utils.Rectangle;

public class App {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[4];

        objects[0] = new Circle(5);
        objects[1] = new Circle(3);
        objects[2] = new Rectangle(4, 5);
        objects[3] = new Rectangle(2, 6);

        double total = sumArea(objects);
        System.out.println("Total area: " + total);
    }

    public static double sumArea(GeometricObject[] a){
        double sumArea = 0.0;

        for (GeometricObject object : a){
            sumArea += object.getArea();
        }

        return sumArea;
    }
}
