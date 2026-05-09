public class Exercise8_16 {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 2},
                {1, 7},
                {4, 5},
                {1, 2},
                {1, 1},
                {4, 1}};

        Util.printMatrix(matrix);

        System.out.println("\n");
        sort(matrix);

        Util.printMatrix(matrix);
    }

    public static void sort(int m[][]){
        for (int row = 0; row < m.length - 1; row++) {
            int minRowIndex = row;

            for (int searchRow = row + 1; searchRow < m.length; searchRow++) {
                if (m[searchRow][0] < m[minRowIndex][0]){
                    minRowIndex = searchRow;
                }
                else if (m[searchRow][0] ==  m[minRowIndex][0] && m[searchRow][1] < m[minRowIndex][1]){
                    minRowIndex = searchRow;
                }
            }

            if (minRowIndex != row) {
                int[] temp = m[row];
                m[row] = m[minRowIndex];
                m[minRowIndex] = temp;
            }
        }
    }
}
