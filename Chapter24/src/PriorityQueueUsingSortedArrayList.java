import java.util.ArrayList;
import java.util.Comparator;

public class PriorityQueueUsingSortedArrayList<E> {
    private ArrayList<E> list;
    private Comparator<? super E> comparator;

    public PriorityQueueUsingSortedArrayList() {
        comparator = Comparator.comparing(o -> ((Comparable) o));

        list = new ArrayList<>();
    }

    public PriorityQueueUsingSortedArrayList(Comparator<E> comparator) {
        this.comparator = comparator;
        list = new ArrayList<E>();
    }

    public void enqueue(E newObject) {
        if (list.size() == 0) {
            list.add(newObject);
            return;
        }
        else {
            for (int count = 0; count < list.size(); count++) {
                if (comparator.compare(list.get(count), newObject) >= 0) {
                    list.add(count, newObject);
                    return;
                }
            }
        }

        list.add(newObject);
    }

    public E dequeue() {
        return list.removeLast();
    }

    public int getSize() {
        return list.size();
    }
}
