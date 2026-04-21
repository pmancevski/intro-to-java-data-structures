import java.util.Locale;
import java.util.Scanner;

// this exercise is skipped for now
public class Exercise5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        for (int row = 1; row <= numberOfLines; row++) {
            int calculateWhiteSpace = (numberOfLines - row) * 2;

            while (calculateWhiteSpace > 0) {
                System.out.print("  ");
                calculateWhiteSpace--;
            }

            System.out.println(row);
        }
    }
}
