import java.util.Locale;
import java.util.Scanner;

public class Exercise5_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String temp = "";

        if (number < 0){
            System.out.println("The number is negative");
            System.exit(0);
        }
        else if (number == 0){
            System.out.println("The octal is 0");
            System.exit(1);
        }

        while (number > 0) {
            temp += number % 8;
            number = number / 8;
        }

        String octal = "";
        for (int count = temp.length() - 1; count >= 0 ; count--) {
            octal += temp.charAt(count);
        }

        System.out.println("The octal is " + octal);
    }
}
