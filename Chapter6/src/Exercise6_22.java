import java.util.Locale;
import java.util.Scanner;

public class Exercise6_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a positive double number: ");
        double number = input.nextDouble();

        System.out.println("Square root of " + number + " is " + sqrt(number));
    }

    // not sure if its type in the book, but i change method header from long to double.
    public static double sqrt(double n){
        double lastGuess = 1.0;
        double nextGuess = (lastGuess + n / lastGuess) / 2;

        while (Math.abs(nextGuess - lastGuess) >= 0.00001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;

        }

        return nextGuess;
    }
}
