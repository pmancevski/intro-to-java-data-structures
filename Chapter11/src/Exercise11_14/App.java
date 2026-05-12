package Exercise11_14;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.addAll(list2);
        return list1;
    }
}
