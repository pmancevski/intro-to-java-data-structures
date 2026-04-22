import java.util.Locale;
import java.util.Scanner;

public class Exercise5_37 {
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
            System.out.println("The binary is 0");
            System.exit(1);
        }

        while (number > 0) {
            temp += number % 2;
            number = number / 2;
        }

        String binary = "";
        for (int count = temp.length() - 1; count >= 0 ; count--) {
            binary += temp.charAt(count);
        }

        System.out.println("The binary is " + binary);
    }
}
