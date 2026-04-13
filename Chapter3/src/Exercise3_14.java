import java.util.Locale;
import java.util.Scanner;

public class Exercise3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int randomNumber = (int)(Math.random() * 2);
        System.out.print("Please enter 0 - head or 1 - tail: ");
        int guess = input.nextInt();

        if (guess == randomNumber) {
            System.out.println("Computer had" +
                    (randomNumber == 0 ? " head (0) " : " tail (1).") + " Your guess is correct.");
        }
        else {
            System.out.println("Computer had " +
                    (randomNumber == 0 ? " head (0) " : " tail (1).") + " Your guess is incorrect.");
        }
    }
}
