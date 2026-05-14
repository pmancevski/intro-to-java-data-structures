package Exercise13_4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int year = 0;
        int month = 0;

        if (args.length == 2) {
            month = Integer.parseInt(args[0]);
            year = Integer.parseInt(args[1]);
        }
        else if (args.length == 1) {
            month = Integer.parseInt(args[0]);
            year = Calendar.getInstance().get(Calendar.YEAR);
        }
        else if (args.length == 0) {
            month = Calendar.getInstance().get(Calendar.MONTH) + 1;
            year = Calendar.getInstance().get(Calendar.YEAR);
        }
        else {
            System.out.println("Usage: java App <month> <year>");
            System.exit(1);
        }

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, 1);

        printMonthTitle(calendar);
        printMonthBody(calendar);
    }

    public static void printMonthTitle(GregorianCalendar calendar) {
        System.out.println("         " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US)
                + " " + calendar.get(Calendar.YEAR));
        System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(GregorianCalendar calendar) {

        int startDay = calendar.get(Calendar.DAY_OF_WEEK);
        int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        int i = 0;
        for (i = 0; i < (startDay - 1); i++)
            System.out.print("    ");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + (startDay - 1)) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }
}
