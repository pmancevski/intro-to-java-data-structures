import java.util.Locale;
import java.util.Scanner;

public class Exercise8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double[][] matrix = new double[4][4];

        System.out.println("Enter a 4−by−4 matrix row by row:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }

    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;

        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                if (column == row) {
                    sum += m[row][column];
                }
            }
        }

        // when i copy and paste my solution to AI for check, it proposed alternative approach which in my opinion is
        // more elegant and efficient

//        for (int count = 0; count < m.length; count++){
//            sum += m[count][count];
//        }

        return sum;
    }
}
