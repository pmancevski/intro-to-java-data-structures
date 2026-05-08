import java.util.Locale;
import java.util.Scanner;

public class Exercise8_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] matrix = Util.enterMatrix(row, column, input);
        int[] largestElement = locateLargest(matrix);

        System.out.println("The location of the largest element is at (" + largestElement[0] + ", "
                + largestElement[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] largestElement = new int[2];
        int largestElementRow = 0;
        int largestElementColumn = 0;
        double element = a[0][0];

        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                if (a[row][column] > element) {
                    element = a[row][column];
                    largestElementRow = row;
                    largestElementColumn = column;
                }
            }
        }

        largestElement[0] = largestElementRow;
        largestElement[1] = largestElementColumn;

        return largestElement;
    }
}
