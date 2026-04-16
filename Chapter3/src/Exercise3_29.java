import java.util.Locale;
import java.util.Scanner;

public class Exercise3_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter circle1’s center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double c1radius = input.nextDouble();

        System.out.print("Enter circle2’s center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double c2radius = input.nextDouble();

        double centerDistance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        boolean isInside = centerDistance <= (c1radius - c2radius);
        boolean isOverlap = centerDistance < (c1radius + c2radius);

        if (isInside){
            System.out.println("circle2 is inside circle1");
        }
        else if (isOverlap){
            System.out.println("circle2 overlaps circle1");
        }
        else {
            System.out.println("circle2 does not overlap circle1");
        }
    }
}
