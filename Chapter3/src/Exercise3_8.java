import java.util.Locale;
import java.util.Scanner;

public class Exercise3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter 3 integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if (number1 > number2 && number1 > number3) {
            if (number2 > number3) {
                System.out.println("Entered integers in non-decreasing order are: "
                        + number3 + ", " + number2 + ", " + number1);
            }
            else {
                System.out.println("Entered integers in non-decreasing order are: "
                        + number2 + ", " + number3 + ", " + number1);
            }
        }
        else if (number2 > number1 && number2 > number3) {
            if (number3 > number1) {
                System.out.println("Entered integers in non-decreasing order are: "
                        + number1 + ", " + number3 + ", " + number2);
            }
            else {
                System.out.println("Entered integers in non-decreasing order are: "
                        + number3 + ", " + number1 + ", " + number2);
            }
        }
        else if (number3 > number1 && number3 > number2) {
            if (number2 > number1) {
                System.out.println("Entered integers in non-decreasing order are: "
                        + number1 + ", " + number2 + ", " + number3);
            }
            else {
                System.out.println("Entered integers in non-decreasing order are: "
                        + number2 + ", " + number1 + ", " + number3);
            }
        }
    }
}
