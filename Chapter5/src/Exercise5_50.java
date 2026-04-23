import java.util.Locale;
import java.util.Scanner;

public class Exercise5_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int countUpperCase = 0;

        for (int count = 0; count < str.length() ; count++){
            if (str.charAt(count) >= 'A' && str.charAt(count) <= 'Z') {
                countUpperCase++;
            }

            // while AI was checking suggested this solution, which is better
//            if (Character.isUpperCase(str.charAt(count))) {
//                countUpperCase++;
//            }
        }

        System.out.println("The number of uppercase letters is " + countUpperCase);
    }
}
