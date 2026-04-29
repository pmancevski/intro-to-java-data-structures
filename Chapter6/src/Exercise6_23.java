import java.util.Locale;
import java.util.Scanner;

public class Exercise6_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        System.out.print("Enter the character you want to count: ");
        String character = input.nextLine();

        System.out.println("The character " + character + " appears "
                + count(string, character.charAt(0)) + " times in the string.");
    }

    public static int count(String str, char a){
        int countCharacters = 0;

        for(int count = 0; count < str.length(); count++){
            if(str.charAt(count) == a){
                countCharacters++;
            }
        }

        return countCharacters;
    }
}
