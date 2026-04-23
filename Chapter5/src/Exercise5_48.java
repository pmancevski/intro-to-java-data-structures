import java.util.Locale;
import java.util.Scanner;

public class Exercise5_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        for (int count = 0; count < str.length() ; count++) {
            // In the book says to be process every character on odd position (starting from 1),
            // but string starts at position 0, so without any additional calculation i started at 0 :) maybe its wrong,
            // but it works
            // if ((i + 1) % 2 == 1) {  // Position is odd (1,3,5...)
            if (count % 2 == 0){
                System.out.print(str.charAt(count));
            }
        }
    }
}
