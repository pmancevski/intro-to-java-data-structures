import java.util.Locale;
import java.util.Scanner;

public class Exercise3_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        double r1width = input.nextDouble();
        double r1height = input.nextDouble();

        System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        double r2width = input.nextDouble();
        double r2height = input.nextDouble();

        double leftr1 = r1x - r1width / 2;
        double rightr1 = r1x + r1width / 2;
        double bottomr1 = r1y - r1height / 2;
        double topr1 =  r1y + r1height / 2;

        double leftr2 = r2x - r2width / 2;
        double rightr2 = r2x + r2width / 2;
        double bottomr2 = r2y - r2height / 2;
        double topr2 =  r2y + r2height / 2;

        boolean isInside = leftr2 >= leftr1 && rightr2 <= rightr1 && bottomr2 >= bottomr1 && topr2 <= topr1;

        boolean isOverlap = leftr2 < rightr1 && rightr2 > leftr1 && bottomr2 < topr1 && topr2 > bottomr1;

        if (isInside){
            System.out.println("r2 is inside r1");
        }
        else if (isOverlap){
            System.out.println("r2 overlaps r1");
        }
        else {
            System.out.println("r2 does not overlap r1");
        }
    }
}
