import java.util.Locale;
import java.util.Scanner;

public class Exercise8_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        char[][] table = initializeMatrix();
        char turn = 'O';

        do {
            printTable(table);

            turn = turn == 'X' ? 'O' :'X';

            System.out.print("Enter a row (0, 1, or 2) for player " + turn + ": ");
            int row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player " + turn + ": ");
            int column = input.nextInt();

            table[row][column] = turn;
        }
        while (!checkStatus(table, turn));
    }

    public static boolean checkStatus(char[][] table, char playerLastTurn) {

        // Check rows
        for (int row = 0; row < table.length; row++) {
            if (table[row][0] == playerLastTurn && table[row][1] == playerLastTurn
                    && table[row][2] == playerLastTurn) {
                System.out.println("\n" + playerLastTurn + " player won");
                return true;
            }
        }

        // Check columns
        for (int column = 0; column < 3; column++) {
            if (table[0][column] == playerLastTurn && table[1][column] == playerLastTurn
                    && table[2][column] == playerLastTurn) {
                System.out.println("\n" + playerLastTurn + " player won");
                return true;
            }
        }

        // Check diagonals
        if (table[0][0] == playerLastTurn && table[1][1] == playerLastTurn && table[2][2] == playerLastTurn) {
            System.out.println("\n" + playerLastTurn + " player won");
            return true;
        }
        else if (table[0][2] == playerLastTurn && table[1][1] == playerLastTurn && table[2][0] == playerLastTurn){
            System.out.println("\n" + playerLastTurn + " player won");
            return true;
        }

        boolean allFieldsPopulated = true;
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                if (table[row][column] == ' ') {
                    allFieldsPopulated = false;
                    break;
                }
            }
        }

        if (allFieldsPopulated) {
            System.out.println("\nIt is a draw!");
            return true;
        }

        return false;
    }

    public static void printTable(char[][] tokens){

        for (int row = 0; row < tokens.length; row++){
            System.out.println("-------------------------");
            for (int column = 0; column < tokens[row].length; column++){
                if (tokens[row][column] != ' ' ){
                    System.out.print("|   " + tokens[row][column] + "   ");
                }
                else {
                    System.out.print("|       ");
                }
            }
            System.out.println("|");
        }
        System.out.println("-------------------------\n");
    }

    public static char[][] initializeMatrix(){
        char[][] matrix = new char[3][3];

        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = ' ';
            }
        }

        return matrix;
    }
}
