//skipped
public class Exercise8_23 {
    public static void main(String[] args) {

    }

    public static int[][] generateEvenMatrix() {
        int[][] matrix = new int[6][6];

        for (int row = 0; row < 6; row++) {
            for (int column = 0; column < 6; column++) {

                int random = (int) (Math.random() * 2);

                matrix[row][column] = random;
            }
        }

        return matrix;
    }
}
