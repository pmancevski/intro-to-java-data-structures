package Exercise10_10;

public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    public int dequeue() {
        int value = elements[0];

        for (int count = 0; count < getSize() - 1; count++){
            elements[count] = elements[count + 1];
        }

        size--;

        return value;
    }

    public void empty(){
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public int getSize(){
        return size;
    }
}
