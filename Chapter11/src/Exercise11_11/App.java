package Exercise11_11;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();

        list.add(5);
        list.add(6);
        list.add(3);
        list.add(10);
        list.add(7);

        sort(list);

        for (Integer integer : list){
            System.out.println(integer);
        }
    }

    public static void sort(ArrayList<Integer> list){
        //this
        // list.sort((a, b) -> a - b);

        //or

        for (int count = 0; count < list.size() - 1; count++) {
            for (int search = count + 1; search < list.size(); search++) {

                if (list.get(count) > list.get(search)) {
                    int temp = list.get(count);
                    list.set(count, list.get(search));
                    list.set(search, temp);
                }
            }
        }
    }
}
