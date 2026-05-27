import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Exercise22_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int userInput = -1;
        int countIndex = 0;

        // 2 4 4 8 8 8 8 2 4 4 0
        System.out.println("Enter a series of numbers ending with 0:");
        while (userInput != 0){
            userInput = input.nextInt();

            if (userInput != 0){
                countIndex++;
            }
        }

        System.out.println("longest sequence: ");
        System.out.println("The longest same number sequence starts at index ");

        System.out.println("number: " );
        System.out.println("index: " + countIndex);
        System.out.println("number: ");
    }
}
