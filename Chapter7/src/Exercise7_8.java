import java.util.Locale;
import java.util.Scanner;

public class Exercise7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int[] integers = new int[10];

        System.out.print("Enter 10 integers: ");
        for (int count = 0; count < integers.length; count++) {
            integers[count] = input.nextInt();
        }

        System.out.println("Average of 10 integers is " + average(integers));

        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int count = 0; count < numbers.length; count++) {
            numbers[count] = input.nextDouble();
        }

        System.out.println("Average of 10 numbers is " + average(numbers));
    }

    public static double average(int[] array){
        double sum = 0;

        for (int index = 0; index < array.length; index++){
            sum += array[index];
        }

        return sum/array.length;
    }

    public static double average(double[] array){
        double sum = 0;

        for (int index = 0; index < array.length; index++){
            sum += array[index];
        }

        return sum/array.length;
    }
}
