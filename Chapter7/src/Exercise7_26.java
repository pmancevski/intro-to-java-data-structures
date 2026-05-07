import java.util.Locale;
import java.util.Scanner;

/*
    exercise is not fully correct, based on the exercise text
 */
public class Exercise7_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the size of the array1: ");
        int size1 = input.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Enter elements of the array1: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = input.nextInt();
        }

        System.out.print("Enter the size of the array2: ");
        int size2 = input.nextInt();
        int[] array2 = new int[size2];

        System.out.print("Enter elements of the array2: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }

        System.out.println((equals(array1, array2) ? "Two lists are strictly identical"
                : "Two lists are not strictly identical"));
    }

    public static boolean equals(int[] list1, int[] list2){
        if(list1.length != list2.length){
            return false;
        }

        for(int i = 0; i < list1.length; i++){
            if(list1[i] != list2[i]){
                return false;
            }
        }

        return true;
    }
}
