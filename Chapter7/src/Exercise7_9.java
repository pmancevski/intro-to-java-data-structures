public class Exercise7_9 {
    public static void main(String[] args) {
        double[] numbers = {1.9, 2.5, 3.7, 2, 1.5, 6, 3, 4, 5, 2};

        System.out.println("Min: " + min(numbers));
    }

    public static double min(double[] array){
        double min = array[0];

        for (int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }

        return min;
    }
}
