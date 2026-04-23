import java.util.Locale;
import java.util.Scanner;

public class Exercise5_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String number = input.nextLine();

        if (number.length() != 12){
            System.out.println(number + " is an invalid ISBN number");
            System.exit(0);
        }

        long number1 = Long.parseLong(number);

        int checksum = 0;

        for (int counter = 12; counter > 0; counter--) {
            if (counter % 2 == 0){
                checksum += (number1 % 10) * 3;
            }
            else {
                checksum += (number1 % 10);
            }

            number1 = number1 / 10;
        }

        checksum = 10 - (checksum % 10);

        if (checksum == 10){
            System.out.print("The ISBN-13 number is " + number + "0");
        }
        else {
            System.out.print("The ISBN-13 number is " + number + checksum);
        }
    }
}
