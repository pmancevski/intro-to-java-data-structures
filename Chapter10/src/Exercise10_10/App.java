package Exercise10_10;

public class App {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Queue size " + queue.getSize());
        // Add 20 numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        System.out.println("Queue size " + queue.getSize());

        // Remove and display all numbers
        while (queue.getSize() > 0) {
            System.out.print(queue.dequeue() + " ");
        }

        System.out.println("\nQueue size " + queue.getSize());
    }
}
