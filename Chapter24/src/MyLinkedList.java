import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public MyLinkedList() {}

    public MyLinkedList(E[] objects) {
        for (int count = 0; count < objects.length; count++) {
            add(objects[count]);
        }
    }

    public E getFirst(){
        if (size == 0) {
            return null;
        }
        else {
            return head.element;
        }
    }

    public E getLast(){
        if (size == 0) {
            return null;
        }
        else {
            return tail.element;
        }
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;

        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(E e){
        Node<E> newNode = new Node<>(e);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    @Override
    public void add(int index, E e) {
        if (index == 0){
            addFirst(e);
        }
        else if (index >= size) {
            addLast(e);
        }
        else {
            Node<E> current = head;

            for (int count = 0; count < index; count++) {
                current = current.next;
            }

            Node<E> temp = current.next;
            current.next = new Node<>(e);
            current.next.next = temp;
            size++;
        }
    }

    public E removeFirst(){
        if (size == 0) {
            return null;
        }
        else {
            Node<E> temp = head;
            head = head.next;
            size--;

            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    public E removeLast(){
        if (size == 0 || size == 1) {
            return removeFirst();
        }
        else {
            Node<E> current = head;
            for (int count = 0; count < size - 2; count++) {
                current = current.next;
            }

            E temp = tail.element;
            tail = current;
            tail.next = null;
            size--;
            return temp;
        }
    }

    @Override
    public E remove (int index) {
        if (index < 0 || index >= size) {
            return null; // Out of range
        }
        else if (index == 0) {
            return removeFirst(); // Remove first
        }
        else if (index == size - 1) {
            return removeLast(); // Remove last
        }
        else {
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;

            return current.element;
        }

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;

        for (int count = 0; count < size; count++) {
            result.append(current.element);
            current = current.next;

            if (current != null) {
                result.append(", ");
            }
            else {
                result.append("]");
            }
        }

        return result.toString();
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size());
        }

        Node<E> current = head;
        for (int count = 0; count < index; count++) {
            current = current.next;
        }

        return current.element;
    }

    @Override
    public int indexOf(Object e) {

        for (int count = 0; count < size; count++) {
            if (e.equals(get(count))) {
                return count;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        int lastIndex = -1;
        Node<E> current = head;

        for (int count = 0; count < size; count++) {
            if (e.equals(current.element)) {
                lastIndex = count;
            }

            current = current.next;
        }

        return lastIndex;
    }

    @Override
    public E set(int index, E e) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        E old = current.element;
        current.element = e;

        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    @Override
    public void clear() {
        size = 0;
        head = tail = null;
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }

        @Override
        public void remove() {

        }
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }
}
