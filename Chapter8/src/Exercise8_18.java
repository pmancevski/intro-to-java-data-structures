public class Exercise8_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        Util.printMatrix(m);
        System.out.println();
        shuffle(m);
        Util.printMatrix(m);
    }

    public static void shuffle(int[][] m){

        for (int row = 0; row < m.length; row++) {
            int radomIndex = (int) (Math.random() * m.length);

            int[] temp = m[row];
            m[row] = m[radomIndex];
            m[radomIndex] = temp;
        }
    }
}
