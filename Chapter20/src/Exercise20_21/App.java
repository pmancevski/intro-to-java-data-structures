package Exercise20_21;

import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        String[] strings = new String[6];

        System.out.print("Enter 6 strings: ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = input.next();
        }

        Comparator<String> comparator = (o1, o2) -> {
            if (o1.charAt(o1.length() - 1) > o2.charAt(o2.length() - 1)) {
                return 1;
            }
            else if (o1.charAt(o1.length() - 1) < o2.charAt(o2.length() - 1)) {
                return -1;
            }

            return 0;
        };

        printArray(strings);
        selectionSort(strings, comparator);
        printArray(strings);
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public static <E> void selectionSort(E[] list, Comparator<? super E> comparator){
        for (int count = 0; count < list.length; count++) {
            int minIndex = count;

            for(int innerCount = count + 1; innerCount < list.length; innerCount++){
                if (comparator.compare(list[innerCount], list[minIndex]) < 0){
                    minIndex = innerCount;
                }
            }

            if (minIndex != count){
                E temp = list[count];
                list[count] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }
}
