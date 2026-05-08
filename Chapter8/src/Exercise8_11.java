import java.util.Locale;
import java.util.Scanner;

public class Exercise8_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();

        String binary = String.format("%9s", Integer.toBinaryString(number)).replace(' ', '0');

        Util.printMatrix(getMatrix(binary));
    }

    public static char[][] getMatrix(String binaryNumber){
        char[][] matrix = new char[3][3];
        char[] stringsToChar = binaryNumber.toCharArray();
        int count = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (stringsToChar[count] == '0' ? 'H' : 'T');
                count++;
            }
        }

        return matrix;
    }
}
