import java.util.Locale;
import java.util.Scanner;

public class Exercise7_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the size of the list: ");
        int listSize = input.nextInt();

        int[] list = new int[listSize];

        System.out.print("Enter the contents of the list: ");
        for (int count = 0; count < listSize; count++) {
            list[count] = input.nextInt();
        }

        System.out.print("The list has " + listSize + " integers ");
        printArray(list);

        System.out.println("\nThe list is " + (isSorted(list) ? "sorted" : "not sorted"));
    }

    public static boolean isSorted(int[] list){
        boolean sorted = true;

        for(int count = 0; count < list.length - 1; count++){
            int elementToCompare = list[count];

            for (int innerCount = count + 1; innerCount < list.length; innerCount++){
                if (elementToCompare > list[innerCount]){
                    sorted = false;
                    break;
                }
            }
        }

        return sorted;
    }

    public static void printArray(int[] array){
        for (int count = 0; count < array.length; count++){
            System.out.print(array[count] + " ");
        }
    }
}
