package Exercise19_3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> newList = new ArrayList<>();

        for (E e: list){
            if(!newList.contains(e)){
                newList.add(e);
            }
        }

        return newList;
    }
}
