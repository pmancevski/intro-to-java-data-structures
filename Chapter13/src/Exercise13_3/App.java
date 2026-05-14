package Exercise13_3;

import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {

    }

    public static void sort(ArrayList<Number> list){
        for (int count = 0; count < list.size() - 1; count++) {
            int minIndex = count;

            for (int search = count + 1; search < list.size(); search++) {
                if (list.get(search).doubleValue() < list.get(minIndex).doubleValue()) {
                    minIndex = search;
                }
            }

            if (minIndex != count) {
                Number temp = list.get(count);
                list.set(count, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
