import java.util.Locale;
import java.util.Scanner;

public class Exercise8_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},  // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly - or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475},  // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        System.out.print("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) \nEnter the filing status: ");
        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = 0;
        double remaining = income;

        for (int count = brackets[status].length - 1; count >= 0; count--) {

            double bracketLimit;

            if (count == 0) {
                bracketLimit = brackets[status][0];
            } else {
                bracketLimit = brackets[status][count] - brackets[status][count-1];
            }

            if (remaining > bracketLimit) {
                tax += bracketLimit * rates[count];
                remaining -= bracketLimit;
            } else {
                tax += remaining * rates[count];
                break;
            }
        }

        if (remaining > 0) {
            tax += remaining * rates[rates.length - 1];
        }

        System.out.println("Tax is " + tax);
    }
}
