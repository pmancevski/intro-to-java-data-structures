import java.util.Scanner;

public class Exercise2_11 {
    public static void main(String[] args) {
        // - One birth every 7 seconds
        // - One death every 13 seconds
        // - One new immigrant every 45 seconds

        // - Current population: 312,032,486
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int yearInSeconds = ((years * 365) * 24 * 60 * 60);

        int currentPopulation = 312032486;
        double birthsPerYear = yearInSeconds / 7.0;
        double deathsPerYear = yearInSeconds / 13.0;
        double immigrantsPerYear = yearInSeconds / 45.0;

        System.out.println("The population in 5 years is " +
                (int)(currentPopulation + birthsPerYear - deathsPerYear + immigrantsPerYear));
    }
}
