public class Exercise8_22 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateMatrix(6);

        Util.printMatrix(matrix);

        if (checkRows(matrix) && checkColumns(matrix)){
            System.out.println("All rows and columns have even 1s");
        }
        else {
            System.out.println("Rows and Columns have not even 1s");
        }
    }

    public static boolean checkRows(int[][] matrix){
        //check rows
        for (int rows = 0; rows < matrix.length; rows++){
            int sum = 0;

            for (int columns = 0; columns < matrix[rows].length; columns++){
                sum += matrix[rows][columns];
            }

            if (sum % 2 != 0){
                return false;
            }
        }

        return true;
    }

    public static boolean checkColumns(int[][] matrix){
        //check columns
        for (int column = 0; column < matrix[0].length; column++){
            int sum = 0;

            for (int row = 0; row < matrix.length; row++){
                sum += matrix[row][column];
            }

            if (sum % 2 != 0){
                return false;
            }
        }

        return true;
    }
}
