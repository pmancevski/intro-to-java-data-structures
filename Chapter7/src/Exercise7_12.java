public class Exercise7_12 {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        printArray(reverse(array));
    }

    public static int[] reverse(int[] list){

        for (int count = 0; count < list.length; count++){
            if (count < list.length / 2){
                int swap = list[count];
                list[count] = list[list.length - 1 - count];
                list[list.length - 1 - count] = swap;
            }
        }

        return list;
    }

    public static void printArray(int[] array){
        for (int count = 0; count < array.length; count++){
            System.out.print(array[count] + " ");
        }
        System.out.println();
    }
}
