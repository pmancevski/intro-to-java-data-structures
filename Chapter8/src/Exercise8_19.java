import java.util.Locale;
import java.util.Scanner;

public class Exercise8_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter number of rows and columns: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        int[][] matrix = Util.generateMatrix(rows, columns, 10);

        Util.printMatrix(matrix);

        System.out.println("\nMatrix " + (isConsecutiveFour(matrix) ? "has" : "does not have") + " consecutive four");
    }

    public static boolean isConsecutiveFour(int[][] values){

        //check rows
        for (int rows = 0; rows < values.length; rows++){
            for (int columns = 0; columns < values[rows].length - 3; columns++){
                int elementToCheck = values[rows][columns];

                if (values[rows][columns] == elementToCheck && values[rows][columns + 1] == elementToCheck
                        && values[rows][columns + 2] == elementToCheck && values[rows][columns + 3] == elementToCheck){
                    return true;
                }
            }
        }

        //check columns
        for (int column = 0; column < values[0].length; column++){
            for (int row = 0; row < values.length - 3; row++){
                int elementToCheck = values[row][column];

                if (values[row][column] == elementToCheck && values[row + 1][column] == elementToCheck
                        && values[row + 2][column] == elementToCheck && values[row + 3][column] == elementToCheck){
                    return true;
                }
            }
        }

        // major diagonal
        for (int count = 0; count < values.length - 3; count++){
            int elementToCheck = values[count][count];

            if (values[count][count] == elementToCheck && values[count + 1][count + 1] == elementToCheck
                    && values[count + 2][count + 2] == elementToCheck  && values[count + 3][count + 3] == elementToCheck){
                return true;
            }
        }

        //check minor diagonal
        for (int count = 0; count < values.length - 3; count++){
            int elementToCheck = values[count][values.length - 1 - count];

            if (values[count][values.length - 1 - count] == elementToCheck
                    && values[count + 1][values.length - 2 - count] == elementToCheck
                    && values[count + 2][values.length - 3] == elementToCheck
                    && values[count + 3][values.length - 4] == elementToCheck){
                return true;
            }
        }

        return false;
    }
}
