// because this exercise is very similar to 6.24 and already created the methods there, i just invoke here because
// are static
public class Exercise6_33 {
    public static void main(String[] args) {
        System.out.println("Current date and time is " + formatDateTime());
    }

    public static String formatDateTime(){
        String returnString = "";

        returnString += Exercise6_24.getMonthName(Exercise6_24.getCurrentMonth()) + " " + Exercise6_24.getCurrentDay()
                + ", " + Exercise6_24.getCurrentYear() + " "
                + (String.valueOf(Exercise6_24.getCurrentHours()).length() == 1 ? "0" + Exercise6_24.getCurrentHours()
                    : Exercise6_24.getCurrentHours()) + ":"
                + (String.valueOf(Exercise6_24.getCurrentMinutes()).length() == 1 ? "0" + Exercise6_24.getCurrentMinutes()
                    : Exercise6_24.getCurrentMinutes()) + ":"
                + (String.valueOf(Exercise6_24.getCurrentSeconds()).length() == 1 ? "0" + Exercise6_24.getCurrentSeconds()
                    : Exercise6_24.getCurrentSeconds());

        return returnString;
    }
}
