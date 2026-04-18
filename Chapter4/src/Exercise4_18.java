import java.util.Locale;
import java.util.Scanner;

public class Exercise4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter two characters: ");
        String majorStatus = input.next();

        char majorChar = majorStatus.charAt(0);
        char statusChar = majorStatus.charAt(1);

        if (majorStatus.length() != 2 || !(majorChar == 'M' || majorChar == 'C' || majorChar == 'I') ||
                !(statusChar == '1' || statusChar == '2' || statusChar == '3' || statusChar == '4')) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        String outputString = "";

        switch (majorChar) {
            case 'M' -> outputString += "Mathematics";
            case 'C' -> outputString += "Computer Science";
            case 'I' -> outputString += "Information Technology";
        }

        switch (statusChar) {
            case '1' -> outputString += " Freshman";
            case '2' -> outputString += " Sophomore";
            case '3' -> outputString += " Junior";
            case '4' -> outputString += " Senior";
        }

        System.out.println(outputString);
    }
}
