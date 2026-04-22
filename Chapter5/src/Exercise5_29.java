import java.util.Locale;
import java.util.Scanner;

/*
    This exercise is skipped
 */
public class Exercise5_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter first day of the year (ex: 1 for Monday, 2 for Tuesday, 3 for Wednesday, .. etc.): ");
        int firstDay =  input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        for (int month = 1; month <= 12; month++) {
            //String day = "";
            String monthName = "";

            switch (month) {
                case 2 -> {
                    if (isLeapYear){
                        firstDay = (firstDay + 29) % 7;
                    }
                    else {
                        firstDay = (firstDay + 28) % 7;
                    }
                }
                case 3, 5, 7, 8, 10, 12 -> firstDay = (firstDay + 31) % 7;
                case 4, 11, 6, 9 -> firstDay = (firstDay + 30) % 7;
            }

//            switch (firstDay) {
//                case 1 -> day = "Monday";
//                case 2 -> day = "Tuesday";
//                case 3 -> day = "Wednesday";
//                case 4 -> day = "Thursday";
//                case 5 -> day = "Friday";
//                case 6 -> day = "Saturday";
//                case 0 -> day = "Sunday";
//            }

            switch (month) {
                case 1 ->  monthName = "January";
                case 2 -> monthName = "February";
                case 3 -> monthName = "March";
                case 4 -> monthName = "April";
                case 5 -> monthName = "May";
                case 6 -> monthName = "June";
                case 7 -> monthName = "July";
                case 8 -> monthName = "August";
                case 9 -> monthName = "September";
                case 10 -> monthName = "October";
                case 11 -> monthName = "November";
                case 12 -> monthName = "December";
            }

            System.out.println("\n\n\t\t\t\t" + monthName + " " + year + "\t\t\t\t");
            System.out.println("---------------------------------------------");
            System.out.printf("%5s%6s%6s%6s%6s%6s%6s%n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        }
    }
}
