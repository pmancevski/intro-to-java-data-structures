package Exercise11_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class App {
    public static void main(String[] args) {

    }

    public static void shuffle(ArrayList<Integer> list){
        // this is not yet introduced but
        // Collections.shuffle(list);

        Random random = new Random();
        int tempValue;

        for (int count = 0; count < list.size(); count++) {
            int randomIndex = random.nextInt(list.size());
            tempValue = list.get(count);

            list.set(count, list.get(randomIndex));
            list.set(randomIndex, tempValue);
        }
    }
}
