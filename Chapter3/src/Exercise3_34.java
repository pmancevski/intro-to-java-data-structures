import java.util.Locale;
import java.util.Scanner;

public class Exercise3_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double check = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);

        // Used AI not sure if this condition is true
        boolean withinBounds = (x3 >= Math.min(x1, x2) && x3 <= Math.max(x1, x2) &&
                y3 >= Math.min(y1, y2) && y3 <= Math.max(y1, y2));

        if (check == 0 && withinBounds) {
            System.out.println("(" + x3 + ", " + y3 + ") is on the line segment from (" + x1 + ", " + y1
                    + ") to (" + x2 + ", " + y2 + ")");
        } else {
            System.out.println("(" + x3 + ", " + y3 + ") is not on the line segment from (" + x1 + ", " + y1
                    + ") to (" + x2 + ", " + y2 + ")");
        }
    }
}
