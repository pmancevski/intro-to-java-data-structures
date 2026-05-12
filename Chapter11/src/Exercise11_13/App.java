package Exercise11_13;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    }

    public static void removeDuplicate(ArrayList<Integer> list){
        for (int count = 0; count < list.size(); count++){
            int temp = list.get(count);

            for (int search = count + 1; search < list.size(); search++){
                if (list.get(search).equals(temp)){
                    list.remove(search);
                    search--;
                }
            }
        }
    }
}
