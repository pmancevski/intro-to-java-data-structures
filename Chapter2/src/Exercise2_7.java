import java.util.Scanner;

public class Exercise2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        int days = (int) (minutes / 60 / 24);
        int years = (int) (minutes / 60 / 24 / 365);
        days = days % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
