import java.util.Locale;
import java.util.Scanner;

public class Exercise22_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        int startIndex = 0;
        int start = 0;
        int maxLen = 1;

        for (int count = 1; count < string.length(); count++) {
            if (string.charAt(count) > string.charAt(count - 1)) {

                if (count - startIndex + 1 > maxLen) {
                    maxLen = count - startIndex + 1;
                    start = startIndex;
                }
            } else {
                startIndex = count; // reset start of new sequence
            }
        }

        System.out.println("Maximum consecutive substring is " + string.substring(start, start + maxLen));
    }
}
