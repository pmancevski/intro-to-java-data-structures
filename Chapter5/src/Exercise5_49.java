import java.util.Locale;
import java.util.Scanner;

public class Exercise5_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        str = str.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int count = 0; count < str.length() ; count++) {
            if (!Character.isAlphabetic(str.charAt(count))) {
                continue;
            }

            if (str.charAt(count) == 'a' || str.charAt(count) == 'e'
                    || str.charAt(count) == 'i' || str.charAt(count) == 'o' || str.charAt(count) == 'u') {
                vowels++;
            }
            else {
                consonants++;
            }
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
}
