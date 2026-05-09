import java.util.Locale;
import java.util.Scanner;

public class Exercise8_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        char[][] matrix = Util.initializeMatrix(' ');

        char turn = 'Y';
        int column;
        int row;

        do {
            printTable(matrix);

            turn = turn == 'R' ? 'Y' :'R';

            System.out.print("Drop a "+ (turn == 'R' ? "red" : "yellow") +" disk at column (0 - 6): ");
            column = input.nextInt();

            row = dropDiskAtColumn(column, matrix);
            matrix[row][column] = turn;

        }
        while (!checkStatus(matrix, turn));

    }

    public static int dropDiskAtColumn(int column, char[][] matrix){

        for (int row = matrix.length - 1; row >= 0; row--) {
            if (matrix[row][column] == ' ') {
                return row;
            }
        }

        return -1;
    }

    public static void printTable(char[][] tokens){

        for (int row = 0; row < tokens.length; row++){

            for (int column = 0; column < tokens[row].length; column++){

                if (tokens[row][column] != ' ' ){
                    System.out.print("| " + tokens[row][column] + " ");
                }
                else {
                    System.out.print("|   ");
                }
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------\n");
    }

    public static boolean checkStatus(char[][] values, char key){

        //check rows
        for (int rows = 0; rows < values.length; rows++){
            for (int columns = 0; columns < values[rows].length - 3; columns++){

                if (values[rows][columns] == key && values[rows][columns + 1] == key
                        && values[rows][columns + 2] == key && values[rows][columns + 3] == key){
                    System.out.println("\n" + (key == 'R' ? "Red" : "Yellow") + " player won");
                    return true;
                }
            }
        }

        //check columns
        for (int column = 0; column < values[0].length; column++){
            for (int row = 0; row < values.length - 3; row++){

                if (values[row][column] == key && values[row + 1][column] == key
                        && values[row + 2][column] == key && values[row + 3][column] == key){
                    System.out.println("\n" + (key == 'R' ? "Red" : "Yellow") + " player won");
                    return true;
                }
            }
        }

        // major diagonal
        for (int count = 0; count < values.length - 3; count++){

            if (values[count][count] == key && values[count + 1][count + 1] == key
                    && values[count + 2][count + 2] == key && values[count + 3][count + 3] == key){
                System.out.println("\n" + (key == 'R' ? "Red" : "Yellow") + " player won");
                return true;
            }
        }

        //check minor diagonal
        for (int count = 0; count < values.length - 3; count++){

            if (values[count][values.length - 1 - count] == key
                    && values[count + 1][values.length - 2 - count] == key
                    && values[count + 2][values.length - 3 - count] == key
                    && values[count + 3][values.length - 4 - count] == key){
                System.out.println("\n" + (key == 'R' ? "Red" : "Yellow") + " player won");
                return true;
            }
        }

        return false;
    }
}
