import java.util.Locale;
import java.util.Scanner;

public class Exercise3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final double INCHES_PER_FEET = 12;

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        inches += feet * INCHES_PER_FEET;
        double heightInMeters = inches * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
