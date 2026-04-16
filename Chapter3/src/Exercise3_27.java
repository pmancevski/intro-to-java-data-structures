import java.util.Locale;
import java.util.Scanner;

public class Exercise3_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a point’s x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double x1 = 200;
        double y1 = 0;

        double x2 = 0;
        double y2 = 100;

        //quick check
        if (x < 0 || x > 200 || y < 0 || y > 100) {
            System.out.println("The point is not in the triangle");
            System.exit(0);
        }

        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;

        // Check if point is below or on the slanted side
        if (y <= slope * x + intercept) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}
