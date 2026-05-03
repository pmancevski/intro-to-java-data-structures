import java.util.Arrays;

public class Exercise7_16 {
    public static void main(String[] args) {
        int[] array = generateArray();
        int key = 1 + (int)(Math.random() * 100000);

        long startTime = System.nanoTime();
        int found = linearSearch(array, key);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Linear search: " + duration + " nanoseconds");
        System.out.println("Linear search: " + (duration / 1_000_000_000 ) + " seconds\n\n");

        Arrays.sort(array);
        startTime = System.nanoTime();
        found = binarySearch(array, key);
        endTime = System.nanoTime();
        duration = endTime - startTime;

        System.out.println("Binary search: " + duration + " nanoseconds");
        System.out.println("Binary search: " + (duration / 1_000_000_000 ) + " seconds");
    }

    public static int[] generateArray(){
        int[] array = new int[100000000];

        for (int count = 0; count < array.length; count++) {
            array[count] = 1 + (int)(Math.random() * 100000);
        }

        return array;
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key < list[mid]) {
                high = mid - 1;
            }
            else if (key == list[mid]) {
                return mid;
            }
            else {
                low = mid + 1;
            }
        }

        return -low - 1;
    }
}
