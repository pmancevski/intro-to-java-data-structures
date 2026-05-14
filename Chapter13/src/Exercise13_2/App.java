package Exercise13_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class App {
    public static void main(String[] args) {}


    public static void shuffle(ArrayList<Number> list) {
        // probably this is not expected solution, but in the past i already resolve similar exercise or maybe
        // it was the same
        Collections.shuffle(list);

//        Random random = new Random();
//
//        for (int count = list.size() - 1; count > 0; count--) {
//            int index = random.nextInt(list.size());
//            Number temp = list.get(count);
//            list.set(count, list.get(index));
//            list.set(count, temp);
//        }
    }
}
