package Exercise20_6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

// 5M was to long, minutes for first loop
public class App {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();

        for (int count = 0; count < 500000; count++) {
            list.add(random.nextInt(1000));
        }

        System.out.println("List was populated. Started For loop");

        Long startTime = System.currentTimeMillis();
        for (int count = 0; count < list.size(); count++) {
            list.get(count);
        }
        Long endTime = System.currentTimeMillis();

        System.out.println("Time taken(without iterator): " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        endTime = System.currentTimeMillis();

        System.out.println("Time taken(with iterator): " + (endTime - startTime) + "ms");
    }
}
