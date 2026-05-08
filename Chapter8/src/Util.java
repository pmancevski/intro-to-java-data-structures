import java.util.Scanner;

public class Util {

    public static void printMatrix(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                matrix[row][column] = (int)(Math.random() * 2);
            }
        }

        return matrix;
    }

    public static double[][] enterMatrix(int row, int column, Scanner input) {
        double[][] matrix = new double[row][column];

        for (int countRow = 0; countRow < matrix.length; countRow++) {
            for (int countColumn = 0; countColumn < matrix[countRow].length; countColumn++) {
                matrix[countRow][countColumn] = input.nextDouble();
            }
        }

        return matrix;
    }
}
