package Exercise20_12;

public class App {
    public static void main(String[] args) {
        MyPriorityQueue<String> queue = new MyPriorityQueue<>();

        queue.add("Abc");
        queue.add("Bcd");

        MyPriorityQueue<String> queue1;

        try {
            queue1 = (MyPriorityQueue<String>) queue.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        for (String s : queue1) {
            System.out.println(s);
        }
    }
}
