import java.util.Locale;
import java.util.Scanner;

public class Exercise3_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the time zone offset to GMT: ");
        int GMT_OFFSET = input.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = (totalHours + GMT_OFFSET) % 24;

        String amPm;

        if (currentHour == 0){
            currentHour = 12;
            amPm = "AM";
        }
        else if (currentHour < 12) {
            amPm = "AM";
        }
        else {
            currentHour = currentHour - 12;
            amPm = "PM";
        }

        // Display results
        System.out.println("Current time is " + (currentHour) + ":"
                + currentMinute + ":" + currentSecond + " " + amPm);
    }
}
