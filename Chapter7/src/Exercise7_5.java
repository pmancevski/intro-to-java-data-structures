import java.util.Locale;
import java.util.Scanner;

public class Exercise7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int[] integers = new int[10];
        int distinct = 0;

        System.out.print("Enter 10 numbers:");
        for (int count = 0; count < integers.length; count++) {
            int integer = input.nextInt();

            if (!checkArray(integers, integer)) {
                integers[count] = integer;
                distinct++;
            }
        }

        System.out.println("The number of distinct numbers is " + distinct);
        System.out.print("The distinct numbers are: ");

        for (int count = 0; count < integers.length; count++) {
            if (integers[count] != 0){
                System.out.print(integers[count] + " ");
            }
        }
    }

    public static boolean checkArray(int[] array, int number) {
        boolean exists = false;

        for (int count = 0; count < array.length; count++) {
            if (array[count] == number) {
                exists = true;
                break;
            }
        }

        return exists;
    }
}
