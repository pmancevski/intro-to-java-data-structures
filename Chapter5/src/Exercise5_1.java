import java.util.Locale;
import java.util.Scanner;

public class Exercise5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        boolean flag = true;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        int positiveNumberCount = 0;
        int negativeNumberCount = 0;
        double total = 0;

        while (flag) {
            int num = input.nextInt();

            total += num;

            if (num < 0) {
                negativeNumberCount++;
            }
            else if (num > 0) {
                positiveNumberCount++;
            }

            if (num == 0) {
                flag = false;
            }
        }

        if ((positiveNumberCount + negativeNumberCount) > 0) {
            double average = total / (positiveNumberCount + negativeNumberCount);
            System.out.printf("The number of positives is %d%nThe number of negatives is %d%nThe total is %.1f%n" +
                    "The average is %.2f%n", positiveNumberCount, negativeNumberCount, total, average);
        }
        else {
            System.out.println("No numbers are entered except 0");
        }
    }
}
