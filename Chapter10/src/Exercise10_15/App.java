package Exercise10_15;

import Exercise10_13.MyRectangle2D;

import java.util.Locale;
import java.util.Scanner;
/*
    Helped from AI
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double[][] points = new double[5][2];

        System.out.print("Enter five points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        MyRectangle2D rectangle = getRectangle(points);

        System.out.println("The bounding rectangle's center is (" +
                rectangle.getX() + ", " + rectangle.getY() + ")");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
    }

    public static MyRectangle2D getRectangle(double[][] points){
        double minX = points[0][0];
        double maxX = points[0][0];
        double minY = points[0][1];
        double maxY = points[0][1];

        for (int i = 1; i < points.length; i++) {
            minX = Math.min(minX, points[i][0]);
            maxX = Math.max(maxX, points[i][0]);
            minY = Math.min(minY, points[i][1]);
            maxY = Math.max(maxY, points[i][1]);
        }

        double centerX = (minX + maxX) / 2;
        double centerY = (minY + maxY) / 2;
        double width = maxX - minX;
        double height = maxY - minY;

        return new MyRectangle2D(centerX, centerY, width, height);
    }
}
