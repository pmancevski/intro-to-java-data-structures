package Exercise19_5;

public class App {
    public static void main(String[] args) {}

    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];

        for (E e: list){
            if(e.compareTo(max)>0){
                max = e;
            }
        }

        return max;
    }
}
