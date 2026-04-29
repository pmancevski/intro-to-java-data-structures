import java.util.Scanner;

public class Exercise6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String str = input.nextLine();

        System.out.print("String has " + countLetters(str) + " letters");
    }

    public static int countLetters(String s){
        int countLetters = 0;

        for (int count = 0; count < s.length(); count++) {
            if (Character.isLetter(s.charAt(count))) {
                countLetters++;
            }
        }

        return countLetters;
    }
}
