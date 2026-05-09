package Exercise9_6;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int[] array = getArray();

        stopWatch.start();
        sortArray(array);
        stopWatch.stop();

        System.out.println("Execution in milliseconds: " + stopWatch.getElapsedTime());
    }

    public static void sortArray(int[] arr) {

        for (int count = 0; count < arr.length - 1; count++) {
            for (int j = count + 1; j < arr.length; j++) {
                if (arr[count] > arr[j]) {
                    int temp = arr[count];
                    arr[count] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] getArray(){
        int[] array = new int[100000];
        Random random = new Random();

        for (int count = 0; count < array.length; count++) {
            array[count] = random.nextInt(100000) + 1;
        }

        return array;
    }
}
