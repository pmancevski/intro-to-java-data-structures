import java.util.Locale;
import java.util.Scanner;

public class Exercise7_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int[] inputArray = new int[5];
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = input.nextInt();
        }

        System.out.println("GCD is " + gcd(inputArray));
    }

    public static int gcd(int... numbers) {
        int min = min(numbers);

        for (int divisor = min; divisor > 0; divisor--) {
            boolean isGcd = true;

            for (int count =0; count < numbers.length; count++) {
                if(numbers[count] % divisor != 0) {
                    isGcd = false;
                    break;
                }
            }

            if (isGcd) {
                return divisor;
            }
        }

        return min;
    }

    public static int min(int... numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }
}
