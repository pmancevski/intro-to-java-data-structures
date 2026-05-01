import java.util.Locale;
import java.util.Scanner;

public class Exercise7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int[] intOccurrences = new int[100];

        System.out.print("Enter the integers between 1 and 100: ");
        int integer = input.nextInt();

        while (integer != 0){

            if (integer < 0 || integer > 100){
                System.out.println("Invalid input");
                System.exit(0);
            }

            intOccurrences[integer]++;

            integer = input.nextInt();
        }

        for (int count = 0; count < intOccurrences.length; count++){

            if (intOccurrences[count] == 0){
                continue;
            }

            if (intOccurrences[count] > 1){
                System.out.println(count + " occurs " + intOccurrences[count] + " times");
            }
            else {
                System.out.println(count + " occurs " + intOccurrences[count] + " time");
            }
        }
    }
}
