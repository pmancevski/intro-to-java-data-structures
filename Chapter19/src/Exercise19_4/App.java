package Exercise19_4;

public class App {
    public static void main(String[] args) {

    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
        for (int count = 0; count < list.length; count++){
            if (list[count].compareTo(key) == 0){
                return count;
            }
        }

        return -1;
    }

}
