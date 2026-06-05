import java.util.LinkedList;

public class MyGenericQueue<E> extends LinkedList<E> {

    public void enqueue(E e) {
        add(e);
    }

    public E dequeue() {
        return removeFirst();
    }

    public int getSize() {
        return size();
    }

    @Override
    public String toString() {
        return "Queue: " + super.toString();
    }
}
