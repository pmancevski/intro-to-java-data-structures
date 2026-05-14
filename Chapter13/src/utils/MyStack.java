package utils;

import java.util.ArrayList;

public class MyStack implements Cloneable {

    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        MyStack copy = new MyStack();

        //copy.list = new ArrayList<>(this.list);
        // or

        for (Object o : list) {
            copy.list.add((Object) o);
        }

        return copy;
    }
}
