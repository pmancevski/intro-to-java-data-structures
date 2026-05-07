public class Exercise7_32 {
    public static void main(String[] args) {
        int[] list = {10, 1, 5, 16, 61, 9, 11, 1};

        System.out.println(partition(list));
        printArray(list);
    }

    public static int partition(int[] list){
        int index = 1;
        int pivot = list[0];

        for (int count = 1; count < list.length; count++) {
            if (pivot > list[count]) {
                int temp = list[count];
                list[count] = list[index];
                list[index] = temp;
                index++;
            }
        }

        int temp = list[0];
        list[0] = list[index - 1];
        list[index - 1] = temp;

        return index - 1;
    }

    public static void printArray(int[] array){
        for (int count = 0; count < array.length; count++){
            System.out.print(array[count] + " ");
        }
        System.out.println();
    }
}
