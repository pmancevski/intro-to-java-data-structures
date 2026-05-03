public class Exercise7_15 {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 10, 9, 4, 10, 2, 9};

        printArray(eliminateDuplicates(array));
    }

    public static int[] eliminateDuplicates(int[] list){

        for (int count = 0; count < list.length; count++) {
            int searchNumber = list[count];

            for (int i = count + 1; i < list.length; i++) {
                if (list[i] == searchNumber) {
                    list[i] = 0;
                }
            }
        }

        return list;
    }

    public static void printArray(int[] array){
        System.out.print("The distinct numbers are: ");
        for (int count = 0; count < array.length; count++){
            if  (array[count] != 0){
                System.out.print(array[count] + " ");
            }
        }
    }
}
