package Exercise19_10;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {}

    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        return Collections.max(list);
    }
}
