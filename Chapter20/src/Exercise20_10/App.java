package Exercise20_10;

import java.util.*;

public class App {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(
                Arrays.asList(new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
        System.out.println("Priority Queue 1:" + priorityQueue1);

        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>(
                Arrays.asList(new String[]{"George", "Katie", "Kevin", "Michelle", "Ryan"} ));
        System.out.println("Priority Queue 2:" + priorityQueue2);
        System.out.println();

        Set<String> set1 = new HashSet<>();
        set1.addAll(priorityQueue1);
        set1.addAll(priorityQueue2);

        System.out.println("Union: " + set1);

        set1 = new HashSet<>(priorityQueue1);
        set1.removeAll(priorityQueue2);

        System.out.println("Difference queue1 - queue2: " + set1);

        set1 = new HashSet<>(priorityQueue2);
        set1.removeAll(priorityQueue1);

        System.out.println("Difference queue2 - queue1: " + set1);

        set1 = new HashSet<>(priorityQueue1);
        set1.retainAll(priorityQueue2);

        System.out.println("Intersection: " + set1);
    }
}
