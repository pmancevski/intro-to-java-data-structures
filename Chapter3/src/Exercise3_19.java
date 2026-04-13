import java.util.Locale;
import java.util.Scanner;

public class Exercise3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter 3 edges of a triangle: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        if (!((edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) &&  (edge2 + edge3 > edge1))) {
            System.out.println("Input is invalid");
            System.exit(0);
        }

        double perimeter = edge1 + edge2 + edge3;
        System.out.println("Perimeter of triangle for inserted edges is: " + perimeter);
    }
}
