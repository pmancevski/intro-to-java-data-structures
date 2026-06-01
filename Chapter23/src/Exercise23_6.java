// last two method are not implemented but im assuming that this exercise is complete, its just copy and pasting
// booring
public class Exercise23_6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.print("- ordered(int[] list) - ");
        System.out.println(ordered(array));

        int[] array1 = {3, 2, 1};
        System.out.print("- ordered(int[] list, boolean ascending) - ");
        System.out.println(ordered(array1, false));
    }

    public static <E extends Comparable<E>> boolean ordered (E[] list, boolean ascending) {
        if (list.length == 0)
            return false;

        if (list.length == 1)
            return true;

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i].compareTo(list[i + 1]) < 0) {
                return false;
            }
        }

        return true;
    }

    public static <E extends Comparable<E>> boolean ordered(E[] list){
        if (list.length == 0)
            return false;

        if (list.length == 1)
            return true;

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i].compareTo(list[i + 1]) > 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean ordered (double[] list, boolean ascending){
        if (list.length == 0)
            return false;

        if (list.length == 1)
            return true;

        for (int count = 0; count < list.length - 1; count++) {
            if (list[count] < list[count + 1])
                return false;
        }

        return true;
    }

    public static boolean ordered(double[] list) {
        if (list.length == 0)
            return false;

        if (list.length == 1)
            return true;

        for (int count = 0; count < list.length - 1; count++) {
            if (list[count] > list[count + 1])
                return false;
        }

        return true;
    }

    public static boolean ordered(int[] list){
        if (list.length == 0)
            return false;

        if (list.length == 1)
            return true;

        for (int count = 0; count < list.length - 1; count++) {
            if (list[count] > list[count + 1])
                return false;
        }

        return true;
    }

    public static boolean ordered(int[] list, boolean ascending){
        if (list.length == 0)
            return false;

        if (list.length == 1)
            return true;

        for (int count = 0; count < list.length - 1; count++) {
            if (list[count] < list[count + 1])
                return false;
        }

        return true;
    }

    public static void printArray(int[] list){
        for (int element : list) {
            System.out.print(element + " ");
        }
    }
}
