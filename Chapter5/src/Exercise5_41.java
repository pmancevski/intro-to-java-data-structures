import java.util.Locale;
import java.util.Scanner;

public class Exercise5_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int max = 0;
        int occurrences = 0;

        System.out.print("Enter integers: ");
        int enteredNumber;

        do {
            enteredNumber = input.nextInt();

            if (enteredNumber == 0 && occurrences == 0){
                System.out.println("No numbers are entered except 0");
                System.exit(0);
            }

            if  (enteredNumber > max) {
                max = enteredNumber;
                occurrences = 1;
            }
            else if(enteredNumber == max){
                occurrences++;
            }
        }
        while (enteredNumber != 0);

        System.out.println("The largest number is " + max
                + "\nThe occurrence count of the largest number is " + occurrences);

    }
}
