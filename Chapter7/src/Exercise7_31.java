import java.util.Locale;
import java.util.Scanner;

public class Exercise7_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter list1 size and contents: ");
        int[] array1 = new int[input.nextInt()];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }

        System.out.print("Enter list2 size and contents: ");
        int[] array2 = new int[input.nextInt()];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }

        System.out.print("List1 is ");
        displayArray(array1);
        System.out.print("List2 is ");
        displayArray(array2);

        System.out.print("The merged list is: ");
        displayArray(merge(array1, array2));
    }

    public static int[] merge(int[] list1, int[] list2){
        int[] merged = new int[list1.length + list2.length];

        int mergedCount = 0;
        int countList1 = 0;
        int countList2 = 0;

        while (mergedCount < merged.length){

            if (list1[countList1] > list2[countList2]) {
                merged[mergedCount] = list2[countList2];
                countList2++;
            }
            else if (list1[countList1] < list2[countList2]) {
                merged[mergedCount] = list1[countList1];
                countList1++;
            }
            else if (list1[countList1] == list2[countList2]) {
                merged[mergedCount] = list1[countList1];
                countList1++;
            }

            mergedCount++;

            if (countList1 == list1.length || countList2 == list2.length) {
                break;
            }
        }

        while (countList1 < list1.length){
            merged[mergedCount] = list1[countList1];
            countList1++;
            mergedCount++;
        }

        while (countList2 < list2.length){
            merged[mergedCount] = list2[countList2];
            countList2++;
            mergedCount++;
        }


        return merged;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}
