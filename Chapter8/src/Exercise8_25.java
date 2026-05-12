import java.util.Locale;
import java.util.Scanner;

public class Exercise8_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);


        System.out.println("Enter a 3−by−3 matrix row by row: ");
        double[][] matrix = Util.enterMatrix(3, 3, input);

        if (isMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix");
        }
        else {
            System.out.println("It is not a Markov matrix");
        }
    }

    public static boolean isMarkovMatrix(double[][] m){

        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                if (m[row][column] < 0.0) {
                    return false;
                }
            }
        }

        for (int column = 0; column < m[0].length; column++) {
            double sum = 0;

            for (int row = 0; row < m.length; row++) {
                sum += m[row][column];
            }

            if (sum != 1.0) {
                return false;
            }
        }

        return true;
    }
}
