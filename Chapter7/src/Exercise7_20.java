public class Exercise7_20 {
    public static void main(String[] args) {

        double[] array = {9, 10, 3, 4, 1, 6, 7, 2, 5, 8};

        printArray(array);
        selectionSort(array);
        printArray(array);

    }

    public static void selectionSort(double[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            // Find the minimum in the list[i..list.length−1]
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }

    public static void printArray(double[] array){
        for (int count = 0; count < array.length; count++){
            System.out.print(array[count] + " ");
        }
        System.out.println();
    }

//    public static void selectionSort(double[] list) {
//        for (int i = 0; i < list.length - 1; i++) {
//            // Find the minimum in the list[i..list.length−1]
//            double currentMin = list[i];
//            int currentMinIndex = i;
//
//            for (int j = i + 1; j < list.length; j++) {
//                if (currentMin > list[j]) {
//                    currentMin = list[j];
//                    currentMinIndex = j;
//                }
//            }
//
//            // Swap list[i] with list[currentMinIndex] if necessary
//            if (currentMinIndex != i) {
//                list[currentMinIndex] = list[i];
//                list[i] = currentMin;
//            }
//        }
//    }
}
