import java.util.Locale;
import java.util.Scanner;

public class Exercise8_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int[][] grid = readASolution();

        if (isNumbersValid(grid) && isValidColumns(grid) && isValidRows(grid) && isValidBoxes(grid)) {
            System.out.println("Valid solution");
        }
        else {
            System.out.println("Invalid solution");
        }

//        int[][] matrixValid = {
//                {5, 3, 4, 6, 7, 8, 9, 1, 2},
//                {6, 7, 2, 1, 9, 5, 3, 4, 8},
//                {1, 9, 8, 3, 4, 2, 5, 6, 7},
//                {8, 5, 9, 7, 6, 1, 4, 2, 3},
//                {4, 2, 6, 8, 5, 3, 7, 9, 1},
//                {7, 1, 3, 9, 2, 4, 8, 5, 6},
//                {9, 6, 1, 5, 3, 7, 2, 8, 4},
//                {2, 8, 7, 4, 1, 9, 6, 3, 5},
//                {3, 4, 5, 2, 8, 6, 1, 7, 9}
//        };
//
//        int[][] matrixInvalid = {
//                {5, 5, 4, 6, 7, 8, 9, 1, 2},
//                {6, 7, 2, 1, 9, 5, 3, 4, 8},
//                {1, 9, 8, 3, 4, 2, 5, 6, 7},
//                {8, 5, 9, 7, 6, 1, 4, 2, 3},
//                {4, 2, 6, 8, 5, 3, 7, 9, 1},
//                {7, 1, 3, 9, 2, 4, 8, 5, 6},
//                {9, 6, 1, 5, 3, 7, 2, 8, 4},
//                {2, 8, 7, 4, 1, 9, 6, 3, 5},
//                {3, 4, 5, 2, 8, 6, 1, 7, 9}
//        };


    }

    public static int[][] readASolution() {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();

        return grid;
    }

    public static boolean isNumbersValid(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > 9 || matrix[row][column] < 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isValidColumns (int[][] matrix) {

        for (int column = 0; column < matrix[0].length; column++) {
            boolean[] sudokuNumbers = new boolean[9];

            for (int row = 0; row < matrix.length; row++) {

                if (matrix[row][column] > 9 || matrix[row][column] < 1) {
                    return false;
                }

                sudokuNumbers[matrix[row][column] - 1] = true;
            }

            for (boolean sudokuNumber: sudokuNumbers) {
                if (!sudokuNumber) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isValidRows(int[][] matrix){

        for (int row = 0; row < matrix.length; row++) {
            boolean[] sudokuNumbers = new boolean[9];

            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > 9 || matrix[row][column] < 1) {
                    return false;
                }

                sudokuNumbers[matrix[row][column] - 1] = true;
            }

            for (boolean sudokuNumber: sudokuNumbers) {
                if (!sudokuNumber) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isValidBoxes(int[][] matrix) {
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {

                boolean[] seen = new boolean[9];

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int num = matrix[boxRow * 3 + i][boxCol * 3 + j];
                        if (num < 1 || num > 9 || seen[num - 1]) {
                            return false;
                        }
                        seen[num - 1] = true;
                    }
                }
            }
        }
        return true;
    }
}
