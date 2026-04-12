import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.sqrt((Math.pow(b, 2) - 4 * a * c));

        double root1 = (-b + discriminant) / (2 * a);
        double root2 = (-b - discriminant) / (2 * a);

        if (discriminant > 0){
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        }
        else if (discriminant == 0){
            System.out.println("The equation has one root " + root1);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
