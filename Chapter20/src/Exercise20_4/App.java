package Exercise20_4;

import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        Point2D[] points = new Point2D[100];

        for (int count = 0; count < 100; count++) {
            int x = random.nextInt(100) + 1;
            int y = random.nextInt(100) + 1;

            points[count] = new Point2D.Double(x, y);
        }

        System.out.println("Unsorted Points:");
        printPoints(points);

        System.out.println("Sorted Points(if-else):");
        Arrays.sort(points, new Comparator<Point2D>() {
            @Override
            public int compare(Point2D o1, Point2D o2) {
                if (o1.getY() > o2.getY()) {
                    return 1;
                }
                else if (o1.getY() < o2.getY()) {
                    return -1;
                }
                else {
                    if (o1.getX() > o2.getX()) {
                        return 1;
                    }
                    else if (o1.getX() < o2.getX()) {
                        return -1;
                    }
                    else {
                        return 0;
                    }
                }
            }
        });
        printPoints(points);

        // simpler
        System.out.println("Sorted Points(simpler): ");
        Arrays.sort(points, Comparator.comparingDouble(Point2D::getY)
                .thenComparingDouble(Point2D::getX));
        printPoints(points);
    }

    public static void printPoints(Point2D[] points) {
        for (int count = 0; count < 5; count++) {
            System.out.println(points[count]);
        }
    }
}
