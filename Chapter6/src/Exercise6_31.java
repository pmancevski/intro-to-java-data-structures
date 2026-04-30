import java.util.Locale;
import java.util.Scanner;

public class Exercise6_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a credit card number as a long integer: ");
        long cardNumber = input.nextLong();

        System.out.println(cardNumber + " is " + (isValid(cardNumber) ? "valid" : "invalid"));
    }

    public static boolean isValid(long number) {
        boolean valid =
                (getSize(number) >= 13 && getSize(number) <= 16) &&
                        (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                                prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                        ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

        return valid;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String numberString = Long.toString(number);
        int sum = 0;

        for (int count = 0; count < numberString.length(); count++) {
            if (count % 2 == 0) {
                int cardDigit = Character.getNumericValue(numberString.charAt(count)) * 2;

                sum += getDigit(cardDigit);
            }
        }

        return sum;
    }

    // i started with this method, while testing i didnt realize that sum of 2 digits cannot be more than 19, in
    // another words there is simple solution for extracting digit, because i saw from github its not implemented.
    public static int getDigit(int number) {
        int digit1 = number % 10;

        if (number / 10 != 0) {
            digit1 += (number / 10) % 10;
        }

        // check if new number its with two digits
        if (digit1 / 10 != 0) {
            int temp = digit1;

            digit1 = digit1 % 10;
            digit1 += (temp / 10) % 10;
        }

        return digit1;
    }

    public static int sumOfOddPlace(long number) {
        String numberString = Long.toString(number);
        int sum = 0;

        for (int count = 0; count < numberString.length(); count++) {
            if ((count + 1) % 2 == 0) {
                sum += getDigit(Character.getNumericValue(numberString.charAt(count)));
            }
        }

        return sum;
    }

    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    public static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String num = number + "";
            return Long.parseLong(num.substring(0, k));
        }
        return number;
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }
}
