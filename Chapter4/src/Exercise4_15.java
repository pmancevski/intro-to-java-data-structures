import java.util.Locale;
import java.util.Scanner;

public class Exercise4_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);

        letter = Character.toUpperCase(letter);

        if (!(letter >= 'A' && letter <= 'Z')){
            System.out.println(letter + " is an invalid input");
            System.exit(0);
        }

        int number = -1;

        switch (letter){
            case 'A' -> number = 2;
            case 'B' -> number = 2;
            case 'C' -> number = 2;
            case 'D' -> number = 3;
            case 'E' -> number = 3;
            case 'F' -> number = 3;
            case 'G' -> number = 4;
            case 'H' -> number = 4;
            case 'I' -> number = 4;
            case 'J' -> number = 5;
            case 'K' -> number = 5;
            case 'L' -> number = 5;
            case 'M' -> number = 6;
            case 'N' -> number = 6;
            case 'O' -> number = 6;
            case 'P' -> number = 7;
            case 'Q' -> number = 7;
            case 'R' -> number = 7;
            case 'S' -> number = 7;
            case 'T' -> number = 8;
            case 'U' -> number = 8;
            case 'V' -> number = 8;
            case 'W' -> number = 9;
            case 'X' -> number = 9;
            case 'Y' -> number = 9;
            case 'Z' -> number = 9;
        }

        System.out.println("The corresponding number is " + number );
    }
}
