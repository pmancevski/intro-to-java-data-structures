package Exercise19_9;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {}

    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        Collections.sort(list);
    }
}
