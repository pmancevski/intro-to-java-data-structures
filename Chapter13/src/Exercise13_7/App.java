package Exercise13_7;

import utils.Circle;
import utils.GeometricObject;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<GeometricObject> objects = new ArrayList<>();

        objects.add(new Square(5));
        objects.add(new Square(3));
        objects.add(new Circle(4));
        objects.add(new Square(6));
        objects.add(new Circle(2));;

        for (GeometricObject obj : objects) {
            System.out.println("Area: " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}
