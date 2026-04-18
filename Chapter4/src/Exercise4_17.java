import java.util.Locale;
import java.util.Scanner;

public class Exercise4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.print("Enter a month: ");
        String month = input.next();

        char firstLetter = month.charAt(0);

        if (!Character.isUpperCase(firstLetter) || month.length() != 3) {
            System.out.println(month + " is not a correct month name");
            System.exit(0);
        }

        int daysInMonth;

        switch (month) {
            case "Jan" -> daysInMonth = 31;
            case "Feb" -> daysInMonth = isLeapYear ? 29 : 28;
            case "Mar" -> daysInMonth = 31;
            case "Apr" -> daysInMonth = 30;
            case "May" -> daysInMonth = 31;
            case "Jun" -> daysInMonth = 30;
            case "Jul" -> daysInMonth = 31;
            case "Aug" -> daysInMonth = 31;
            case "Sep" -> daysInMonth = 30;
            case "Oct" -> daysInMonth = 31;
            case "Nov" -> daysInMonth = 30;
            case "Dec" -> daysInMonth = 31;
            default -> daysInMonth = -1;
        }

        System.out.println(month + " " + year + " has " + daysInMonth + " days");
    }
}
