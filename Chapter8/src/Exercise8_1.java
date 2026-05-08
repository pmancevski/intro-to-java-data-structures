import java.util.Locale;
import java.util.Scanner;

public class Exercise8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3−by−4 matrix row by row:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        for (int countColumn = 0; countColumn < matrix[0].length; countColumn++) {
            double sum = sumColumn(matrix, countColumn);

            System.out.println("Sum of the elements at column " + countColumn + " is " + sum);
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;

        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                if (column == columnIndex) {
                    sum += m[row][column];
                }
            }
        }

        return sum;
    }
}
