import java.util.Locale;
import java.util.Scanner;

public class Exercise3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number1 = input.nextInt();

        int number9 =  number1 % 10;
        number1 = number1 / 10;
        int number8 =  number1 % 10;
        number1 = number1 / 10;
        int number7 =  number1 % 10;
        number1 = number1 / 10;
        int number6 =  number1 % 10;
        number1 = number1 / 10;
        int number5 =  number1 % 10;
        number1 = number1 / 10;
        int number4 =  number1 % 10;
        number1 = number1 / 10;
        int number3 =  number1 % 10;
        number1 = number1 / 10;
        int number2 =  number1 % 10;
        number1 = number1 / 10;

        int checksum = (number1 + number2 * 2 + number3 * 3 + number4 * 4 + number5 * 5 + number6 * 6
                + number7 * 7 + number8 * 8 + number9 * 9) % 11;

        if (checksum == 10){
            System.out.print("The ISBN-10 number is " + number1 + number2 + number3 + number4 + number5 + number6
                    + number7 +  number8 + number9 + "X");
        }
        else {
            System.out.print("The ISBN-10 number is " + number1 + number2 + number3 + number4 + number5 + number6
                    + number7 +  number8 + number9 + checksum);
        }
    }
}
