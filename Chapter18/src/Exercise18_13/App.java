package Exercise18_13;

public class App {
    public static void main(String[] args) {
        double[] array = {23.4, 56.7, 12.3, 89.1, 45.6, 78.9, 34.5, 67.8};

        System.out.println(largestNumber(array, array.length - 1));
    }

    public static double largestNumber(double[] array, int index){
        if (index == 0){
            return array[0];
        }
        else {
            double previousMaxIndex = largestNumber(array, index - 1);
            return Math.max(array[index], previousMaxIndex);
        }
    }
}
