import java.util.Locale;
import java.util.Scanner;

public class Exercise3_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Enter an integer: ");
        int userInput = input.nextInt();

        boolean checkOne = userInput % 5 == 0 && userInput % 6 == 0;
        boolean checkTwo = userInput % 5 == 0 || userInput % 6 == 0;
        boolean checkThree = (userInput % 5 == 0 || userInput % 6 == 0) ^ (userInput % 5 == 0 && userInput % 6 == 0);

        System.out.println("Is " + userInput + " divisible by 5 and 6? " + checkOne);
        System.out.println("Is " + userInput + " divisible by 5 or 6? " + checkTwo);
        System.out.println("Is " + userInput + " divisible by 5 or 6, but not both? " + checkThree);
    }
}
