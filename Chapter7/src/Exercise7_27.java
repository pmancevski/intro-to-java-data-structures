import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercise7_27 {
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

        System.out.println(equals(array1, array2) ? "Two lists are identical" : "Two lists are not identical");
    }

    public static boolean equals(int[] list1, int[] list2){
        if (list1.length != list2.length){
            return false;
        }

        // Error-prone solution
//        int[] tempList1 = Arrays.copyOf(list1, list1.length);
//        Arrays.sort(tempList1);
//        int[] tempList2 = Arrays.copyOf(list2, list1.length);
//        Arrays.sort(tempList2);
//
//        for(int i = 0; i < list1.length; i++){
//            if(list1[i] != list2[i]){
//                return false;
//            }
//        }

        for (int count = 0; count < list1.length; count++){
            int occurrencesList1 = 0;
            int occurrencesList2 = 0;
            int countedElement = list1[count];

            for (int countList1 = count + 1; countList1 < list1.length; countList1++){
                if (list1[countList1] == countedElement){
                    occurrencesList1++;
                }
            }

            for (int countList2 = 0; countList2 < list2.length; countList2++){
                if (list2[countList2] == countedElement){
                    occurrencesList2++;
                }
            }

            if (occurrencesList1 != occurrencesList2){
                return false;
            }
        }

        return true;
    }
}
