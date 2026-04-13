import java.util.Locale;
import java.util.Scanner;

public class Exercise3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter month and year: ");
        int month = input.nextInt();
        int year = input.nextInt();

        String monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(monthName + " " + year + " has 31 days");
        }
        else if (month == 2) {
            if (isLeapYear) {
                System.out.println(monthName + " " + year + " has 29 days");
            }
            else {
                System.out.println(monthName + " " + year + " has 28 days");
            }
        }
        else {
            System.out.println(monthName + " " + year + " has 30 days");
        }
    }
}
