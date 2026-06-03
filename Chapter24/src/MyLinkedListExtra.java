public class MyLinkedListExtra<E> extends MyLinkedList<E> {

    /** Create an empty list */
    public MyLinkedListExtra() {
        super();
    }

    /** Create a list from an array of objects */
    public MyLinkedListExtra(E[] objects) {
        super(objects);
    }

    @Override /** Return true if this list contains the element e */
    public boolean contains(Object o) {
        // Implement
        for (E object : this){
            if (object.equals(o)){
                return true;
            }
        }

        return false;
    }

    @Override /** Return the element from this list at the specified index */
    public E get(int index) {
        // Implement
        return super.get(index);
    }

    @Override /** Returns the index of the first matching element in this list.
     *  Returns -1 if no match. */
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override /** Returns the index of the last matching element in this list
     *  Returns -1 if no match. */
    public int lastIndexOf(Object o) {
        // Implement
        int lastIndex = -1;

        for (int i = 0; i < size(); i++) {
            if (o.equals(get(i))) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override /** Replace the element at the specified position in this list
     *  with the specified element. */
    public E set(int index, E e) {
        return super.set(index, e);
    }
}
