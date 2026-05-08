public class Exercise8_10 {
    public static void main(String[] args) {
        int[][] matrix = Util.generateMatrix(4);

        Util.printMatrix(matrix);
        System.out.println("The largest row index: " + findByRow(matrix));
        System.out.println("The largest column index: " + findByColumn(matrix));
    }

    public static int findByColumn(int[][] matrix) {
        int largestColumnIndex = 0;
        int initialCount = 0;

        for (int column = 0; column < matrix[0].length; column++) {
            int count = 0;

            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][column] == 1) {
                    count++;
                }
            }

            if (initialCount < count){
                largestColumnIndex = column;
                initialCount = count;
            }
        }

        return largestColumnIndex;
    }

    public static int findByRow(int[][] matrix) {
        int largestRowIndex = 0;
        int initialCount = 0;

        for (int row = 0; row < matrix.length; row++) {
            int count = 0;

            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 1) {
                    count++;
                }
            }

            if (initialCount < count){
                largestRowIndex = row;
                initialCount = count;
            }
        }

        return largestRowIndex;
    }
}
