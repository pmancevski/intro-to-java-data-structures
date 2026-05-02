public class Exercise7_10 {
    public static void main(String[] args) {
        double[] numbers = {1.9, 2.5, 3.7, 2, 1.5, 6, 3, 4, 5, 2};

        System.out.println("Index of minimum number is: " + indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array){
        int smallestIndex = 0;
        double minimum = array[0];

        for (int count = 0; count < array.length; count++) {
            if (minimum > array[count]){
                smallestIndex = count;
                minimum = array[count];
            }
        }

        return smallestIndex;
    }
}
