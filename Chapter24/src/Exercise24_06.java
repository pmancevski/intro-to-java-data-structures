import java.util.Random;

public class Exercise24_06 {
    public static void main(String[] args) {
        Random random = new Random();

        MyPriorityQueue queue = new MyPriorityQueue();
        PriorityQueueUsingSortedArrayList<Integer> queueUsingSortedArrayList =
                new PriorityQueueUsingSortedArrayList<>();

        long start = System.currentTimeMillis();
        for (int count = 0; count < 500000; count++) {
            int number = random.nextInt(100);

            queue.enqueue(number);
        }

        for (int count = 0; count < queue.getSize(); count++) {
            queue.dequeue();
        }
        long end = System.currentTimeMillis();
        long time = end - start;

        System.out.println("MyPriorityQueue time: " + time);

        start = System.currentTimeMillis();
        for (int count = 0; count < 200000; count++) {
            int number = random.nextInt(100);

            queueUsingSortedArrayList.enqueue(number);
        }

        for (int count = 0; count < queueUsingSortedArrayList.getSize(); count++) {
            queueUsingSortedArrayList.dequeue();
        }
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("MyPriorityQueueUsingSortedArrayList time: " + time);
    }
}
