import java.util.Scanner;

public class Exercise2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double weightInKilograms = weight * 0.45359237;
        double heightInMeters =  height * 0.0254;

        System.out.println("BMI is " + (weightInKilograms / Math.pow(heightInMeters, 2)));
    }
}
