import java.util.Locale;
import java.util.Scanner;

public class Exercise8_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        int[][] matrix = Util.generateMatrix(size);

        Util.printMatrix(matrix);

        int check = checkRows(matrix, 0);
        System.out.println(( check >= 0 ? "All 0s on row " + check : "No same numbers on a row"));
        check = checkRows(matrix, 1);
        System.out.println(( check >= 0 ? "All 1s on row " + check : "No same numbers on a row"));

        check = checkColumns(matrix, 0);
        System.out.println(( check >= 0 ? "All 0s on column " + check : "No same numbers on a column"));
        check = checkColumns(matrix, 1);
        System.out.println(( check >= 0 ? "All 1s on column " + check : "No same numbers on a column"));

        System.out.println((checkMajorDiagonal(matrix) ? "Major diagonal its with same numbers"
                : "No same numbers on the major diagonal"));

        System.out.println((checkMinorDiagonal(matrix) ? "Minor diagonal its with same numbers"
                : "No same numbers on the minor diagonal"));
    }

    public static boolean checkMinorDiagonal(int[][] matrix) {
        int firstElement = matrix[0][matrix.length - 1];

        for (int count = 0; count < matrix.length; count++) {
            if (matrix[count][matrix.length - 1 - count] != firstElement) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkMajorDiagonal(int[][] matrix) {
        int firstElement = matrix[0][0];

        for (int count = 0; count < matrix.length; count++) {
            if (matrix[count][count] != firstElement) {
                return false;
            }
        }

        return true;
    }

    public static int checkColumns(int[][] matrix, int key) {

        for (int column = 0; column < matrix[0].length; column++) {
            boolean allMatch = true;

            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column] != key) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                return column;
            }
        }

        return -1;
    }

    public static int checkRows(int[][] matrix, int key) {

        for (int row = 0; row < matrix.length; row++) {
            boolean allMatch = true;

            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] != key) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch)
                return row;
        }

        return -1;
    }
}
