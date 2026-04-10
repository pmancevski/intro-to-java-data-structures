import java.util.Scanner;

public class Exercise2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double fahrenheit = input.nextDouble();

        System.out.print("Enter the wind speed (7= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        System.out.print("The wind chill index is " +
                (35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed, 0.16)
                        + 0.4275 * fahrenheit * Math.pow(windSpeed, 0.16)));
    }
}
