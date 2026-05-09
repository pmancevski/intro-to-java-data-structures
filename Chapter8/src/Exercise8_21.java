import java.util.Locale;
import java.util.Scanner;

public class Exercise8_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();

        double[][] setOfCities = new double[numberOfCities][2];

        System.out.println("Enter the coordinates of the cities:");
        for (int row = 0; row < setOfCities.length; row++) {
            for (int column = 0; column < setOfCities[0].length; column++) {
                setOfCities[row][column] = input.nextDouble();
            }
        }

        double minTotalDistance = Double.MAX_VALUE;
        int centralCity = 0;


        for (int row = 0; row < setOfCities.length; row++) {
            double totalDistance = 0;

            for (int count = 0; count < numberOfCities; count++) {
                if (row != count){
                    totalDistance += distance(setOfCities[row][0], setOfCities[row][1],
                            setOfCities[count][0], setOfCities[count][1]);
                }
            }

            if (totalDistance < minTotalDistance){
                minTotalDistance = totalDistance;
                centralCity = row;
            }
        }

        System.out.printf("The central city is at (%.1f, %.1f)\n",
                setOfCities[centralCity][0], setOfCities[centralCity][1]);
        System.out.printf("The total distance to all other cities is %.2f\n",
                minTotalDistance);
    }

    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
