import java.util.Locale;
import java.util.Scanner;

public class Exercise4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a letter grade: ");
        char letterGrade = input.next().charAt(0);

        letterGrade = Character.toUpperCase(letterGrade);
        int grade = -1;

        switch (letterGrade) {
            case 'A' -> grade = 4;
            case 'B' -> grade = 3;
            case 'C' -> grade = 2;
            case 'D' -> grade = 1;
            case 'F' -> grade = 0;
            default -> {
                System.out.println(letterGrade + " is an invalid grade");
                System.exit(0);
            }
        }

        System.out.println("The numeric value for grade " + letterGrade + " is " + grade);
    }
}
