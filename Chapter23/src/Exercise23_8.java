import java.util.Comparator;

public class Exercise23_8 {
    public static <E extends Comparable<E>> void insertionSort(E[] list){
        for (int i = 1; i < list.length; i++) {
            E currentElement = list[i];
            int k;

            for (k = i - 1; k >= 0 && list[k].compareTo(currentElement) > 0 ; k--) {
                list[k + 1] = list[k];
            }

            list[k + 1] = currentElement;
        }
    }

    public static <E> void insertionSort(E[] list, Comparator<? super E> comparator){
        for (int i = 1; i < list.length; i++) {
            E currentElement = list[i];
            int k;

            for (k = i - 1; k >= 0 && comparator.compare(list[k], currentElement) > 0 ; k--) {
                list[k + 1] = list[k];
            }

            list[k + 1] = currentElement;
        }
    }
}
