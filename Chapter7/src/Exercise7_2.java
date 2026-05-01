import java.util.Locale;
import java.util.Scanner;

public class Exercise7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int[] integers = new int[10];

        System.out.println("Enter 10 integers: ");

        for (int count = 0; count < integers.length; count++) {
            integers[count] = input.nextInt();
        }

        for (int count = integers.length - 1; count >= 0; count--) {
            System.out.print(integers[count] + " ");
        }
    }
}
