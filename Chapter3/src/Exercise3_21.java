import java.util.Locale;
import java.util.Scanner;

public class Exercise3_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        // h -> day of the week
        // q -> day of the month
        // m -> month. Starting March (3) .... December (12) / January and February are counted as 13 and 14

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month: 1−12: ");
        int month = input.nextInt();

        if (month == 1 || month == 2){
            month += 12;
            year -= 1;
        }

        System.out.print("Enter the day of the month: 1−31: ");
        int dayOfMonth = input.nextInt();

        int h = (dayOfMonth + ((26 * (month + 1)) / 10) + (year % 100) + ((year % 100) / 4) + ((year / 100) / 4)
                + 5 * (year / 100)) % 7;

        String dayOfWeek = "";

        switch (h){
            case 0 -> dayOfWeek = "Saturday";
            case 1 -> dayOfWeek = "Sunday";
            case 2 -> dayOfWeek = "Monday";
            case 3 -> dayOfWeek = "Tuesday";
            case 4 -> dayOfWeek = "Wednesday";
            case 5 -> dayOfWeek = "Thursday";
            case 6 -> dayOfWeek = "Friday";
        }

        System.out.println("Day of the week is " + dayOfWeek);
    }
}
