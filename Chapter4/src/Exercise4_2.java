import java.util.Locale;
import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double p1Latitude = input.nextDouble();
        double p1Longitude = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double p2Latitude = input.nextDouble();
        double p2Longitude = input.nextDouble();

        final double EARTH_RADIUS = 6371.01;

        double distance = EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(p1Latitude)) * Math.sin(Math.toRadians(p2Latitude))
                + Math.cos(Math.toRadians(p1Latitude)) * Math.cos(Math.toRadians(p2Latitude))
                * Math.cos(Math.toRadians(p1Longitude) - Math.toRadians(p2Longitude)));

        System.out.println("The distance between the two points is " + distance + " km");
    }
}
