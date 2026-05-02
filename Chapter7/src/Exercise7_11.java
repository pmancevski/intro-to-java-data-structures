import java.util.Locale;
import java.util.Scanner;

// Only mean is calculate
public class Exercise7_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double[] numbers = new double[10];
        System.out.print("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }

        System.out.println("The mean is " + mean(numbers));
    }

    public static double mean(double[] x) {
        double mean = 0;

        for (int count = 0; count < x.length; count++) {
            mean += x[count];
        }

        return mean / x.length;
    }


}
