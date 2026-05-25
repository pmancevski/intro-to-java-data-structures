package Exercise20_12;

import java.util.PriorityQueue;

public class MyPriorityQueue<T> extends PriorityQueue<T> implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // im assuming that elements are immutable
        MyPriorityQueue<T> copy = new MyPriorityQueue<>();
        copy.addAll(this);

        return copy;
    }
}
