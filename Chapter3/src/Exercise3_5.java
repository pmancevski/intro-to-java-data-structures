import java.util.Locale;
import java.util.Scanner;

public class Exercise3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter today’s day: ");
        int day = input.nextInt();

        String currentNameDay = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "";
        };

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();

        int check = (day + elapsedDays) % 7;

        String futureNameDay = switch (check) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "";
        };

        System.out.println("Today is " + currentNameDay + " and the future day is " + futureNameDay);
    }
}
