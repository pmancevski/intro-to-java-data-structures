import java.util.Locale;
import java.util.Scanner;

public class Exercise6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter three sides of triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (!isValid(side1, side2, side3)) {
            System.out.println("Triangle is not valid");
            System.exit(0);
        }

        System.out.print("The are of a triangle is " + area(side1, side2, side3));
    }

    public static boolean isValid(double side1, double side2, double side3){
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            return true;
        }
        else {
            return false;
        }
    }

    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
