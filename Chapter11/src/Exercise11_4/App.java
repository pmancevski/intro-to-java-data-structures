package Exercise11_4;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    }

    public static Integer max(ArrayList<Integer> list){

        if (list == null || list.isEmpty()){
            return null;
        }

        Integer max = list.get(0);

        for (Integer element : list){
            if (max < element){
                max = element;
            }
        }

        return max;
    }
}
