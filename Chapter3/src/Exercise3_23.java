import java.util.Locale;
import java.util.Scanner;

public class Exercise3_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        boolean isInRectangle = (Math.abs(x) < (10.0 / 2)) && (Math.abs(y) < (5.0 / 2));

        if (isInRectangle) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        }
        else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}
