package Exercise10_4;

public class App {
    public static void main(String[] args) {
        // Create two points
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        // Display distance using instance method
        System.out.println("Distance between (0,0) and (10,30.5): " + point1.distance(point2));
    }
}
