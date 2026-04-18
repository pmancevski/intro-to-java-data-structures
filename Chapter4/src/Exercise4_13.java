import java.util.Locale;
import java.util.Scanner;

public class Exercise4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        letter = Character.toUpperCase(letter);

        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
            System.out.println(letter + " is a vowel");
        }
        else if (letter >= 'A' && letter <= 'Z'){
            System.out.println(letter + " is a consonant");
        }
        else {
            System.out.println(letter + " is an invalid input");
        }
    }
}
