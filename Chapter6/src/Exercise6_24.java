// I butchered this exercise :) but it works xD
public class Exercise6_24 {
    public static void main(String[] args) {
        System.out.println("Current date/time is: " + formatDateTime());
    }

    public static String formatDateTime(){
        String returnString = "";
        // format date, adding leading zeros to month and day if its only 1 digit
        returnString += getCurrentYear() + "-"
                + (String.valueOf(getCurrentMonth()).length() == 1 ? "0" + getCurrentMonth() : getCurrentMonth())
                + "-" + (String.valueOf(getCurrentDay()).length() == 1 ? "0" + getCurrentDay() : getCurrentDay());
        //format time
        returnString += "T" + getCurrentHours() + ":" + getCurrentMinutes() + ":" + getCurrentSeconds() + " GMT";

        return returnString;
    }

    public static long getCurrentSeconds() {
        return (System.currentTimeMillis() / 1000) % 60;
    }

    public static long getCurrentMinutes() {
        return (System.currentTimeMillis() / 60000) % 60;
    }

    public static long getCurrentHours() {
        return (System.currentTimeMillis() / 3600000) % 24;
    }

    public static long getCurrentDay(){
        long remainingDays = getRemainingDays();
        int month = 1;

        while (remainingDays >= getNumberOfDaysInMonth(getCurrentYear(), month)){
            remainingDays -= getNumberOfDaysInMonth(getCurrentYear(), month);
            month++;
        }

        return remainingDays + 1;
    }

    public static int getCurrentMonth(){
        long remainingDays = getRemainingDays();
        int month = 1;

        while (remainingDays > getNumberOfDaysInMonth(getCurrentYear(), month)){
            remainingDays -= getNumberOfDaysInMonth(getCurrentYear(), month);
            month++;
        }

        return month;
    }

    public static int getCurrentYear() {
        long tempTotalDays = getTotalDays();
        int year = 1970;

        while (tempTotalDays >= (isLeapYear(year) ? 365 : 366)){
            if (isLeapYear(year)){
                tempTotalDays -= 366;
            }
            else {
                tempTotalDays -= 365;
            }

            year++;
        }

        return year;
    }

    public static long getRemainingDays(){
        long tempTotalDays = getTotalDays();
        int year = 1970;

        while (tempTotalDays > (isLeapYear(year) ? 365 : 366)){
            if (isLeapYear(year)){
                tempTotalDays -= 366;
            }
            else {
                tempTotalDays -= 365;
            }

            year++;
        }

        return tempTotalDays;
    }

    public static long getTotalDays(){
        return System.currentTimeMillis() / (1000 * 60 * 60 * 24);
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0;
    }

    // this method is not used easy can convert
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1 -> monthName = "January";
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

        return monthName;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
