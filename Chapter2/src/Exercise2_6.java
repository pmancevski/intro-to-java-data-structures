import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int thirdDigit = number % 10;
        number = number / 10;
        int secondDigit = number % 10;
        number = number / 10;

        System.out.println("The sum of the digits is " + (thirdDigit + secondDigit + number));
    }
}
