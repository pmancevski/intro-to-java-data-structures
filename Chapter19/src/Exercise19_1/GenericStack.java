package Exercise19_1;

public class GenericStack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] array = (E[]) new Object[DEFAULT_CAPACITY];
    private int size = 0;
    //private ArrayList<E> list = new ArrayList<>();

    public int getSize() {
        return size;
    }

    public E peek() {
        if (size == 0){
            return null;
        }

        return array[getSize() - 1];
    }

    public void push(E o) {
        if (size == DEFAULT_CAPACITY){
            E[] temp = (E[]) new Object[array.length + DEFAULT_CAPACITY];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
        array[size++] = o;
    }

    public E pop() {
        E o = array[getSize() - 1];
        array[getSize() - 1] = null;
        size--;
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int count = 0; count < size; count++) {
            sb.append(array[count].toString()).append(" ");
        }

        return "stack: " + sb.toString();
    }
}
