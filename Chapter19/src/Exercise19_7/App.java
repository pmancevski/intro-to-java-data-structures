package Exercise19_7;

import java.util.Collections;

public class App {
    public static void main(String[] args) {}

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key){
        int left = 0;
        int right = list.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int comparison = list[middle].compareTo(key);

            if (comparison < 0) {
                left = middle + 1;
            } else if (comparison > 0) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
