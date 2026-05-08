import java.util.Locale;
import java.util.Scanner;

public class Exercise8_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];

        System.out.print("Enter matrix1: ");
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                matrix1[row][column] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");
        for (int row = 0; row < matrix2.length; row++) {
            for (int column = 0; column < matrix2[row].length; column++) {
                matrix2[row][column] = input.nextDouble();
            }
        }

        double[][] result = addMatrix(matrix1, matrix2);

        System.out.println("The matrices are added as follows ");
        printResult(matrix1, matrix2, result, '+');

//        System.out.println("\n");
//
//        result = multiplyMatrix(matrix1, matrix2);
//
//        System.out.println("The multiplication of the matrices is ");
//        printResult(matrix1, matrix2, result, '*');
    }

    // it not finished, not wokring
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] result = new double[a.length][b[0].length];

        for (int row = 0; row < a.length; row++) {
            double sum = 0;

            for (int column = 0; column < a[row].length; column++) {
                sum += a[row][column] * b[column][row];
            }
        }

        return result;
    }

    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] result = new double[a.length][a[0].length];

        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                result[row][column] = a[row][column] + b[row][column];
            }
        }

        return result;
    }

    public static void printResult(double[][] a,  double[][] b, double[][] result, char operation){
        int middleRow = a.length / 2;
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                System.out.print(a[row][column] + " ");
            }

            if (row == middleRow) {
                System.out.print(" " + operation + "  ");
            }
            else {
                System.out.print("    ");
            }

            for (int column = 0; column < b[row].length; column++) {
                System.out.print(b[row][column] + " ");
            }

            if (row == middleRow) {
                System.out.print(" =  ");
            }
            else {
                System.out.print("    ");
            }

            for (int column = 0; column < result[row].length; column++) {
                System.out.print(result[row][column] + " ");
            }

            System.out.println();
        }
    }
}
