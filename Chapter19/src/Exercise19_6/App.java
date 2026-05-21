package Exercise19_6;

public class App {
    public static void main(String[] args) {}

    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];

        for (int row = 0; row < list.length; row++) {
            for (int column = 0; column < list[row].length; column++) {
                if (list[row][column].compareTo(max) > 0) {
                    max = list[row][column];
                }
            }
        }

        return max;
    }
}
