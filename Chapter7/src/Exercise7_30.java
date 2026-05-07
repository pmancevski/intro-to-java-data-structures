import java.util.Locale;
import java.util.Scanner;

public class Exercise7_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the number of values: ");
        int size = input.nextInt();
        int[] values = new int[size];

        System.out.print("Enter the values: ");
        for (int i = 0; i < size; i++) {
            values[i] = input.nextInt();
        }

        System.out.print(isConsecutiveFour(values) ? "The list has consecutive fours"
                : "The list has no consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values){

        for (int count = 0; count <= values.length - 4; count++) {
            if (values[count] == values[count + 1]
                    && values[count] == values[count+2]
                    && values[count] == values[count+3]) {
                return true;
            }
        }

        return false;
    }
}
