import java.util.Locale;
import java.util.Scanner;

public class Exercise7_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int[] array = new int[10];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        displayTwoNumbersCombination(array);
    }

    public static void displayTwoNumbersCombination(int[] array){
        for (int count = 0; count < array.length; count++){
            for (int count1 = count + 1; count1 < array.length; count1++){
                if (array[count1] != array[count]){
                    System.out.println(array[count] + " " + array[count1]);
                }
            }
        }
    }
}
