import java.util.Locale;
import java.util.Scanner;

public class Exercise7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[] students = new int[numberOfStudents];
        int bestScore = 0;

        System.out.print("Enter " + numberOfStudents +" scores: ");

        for (int count = 0; count < numberOfStudents; count++) {
            students[count] = input.nextInt();

            if (students[count] > bestScore) {
                bestScore = students[count];
            }
        }

        for (int count = 0; count < students.length; count++) {
            System.out.println("Student " + count + " score is " + students[count] + " and grade is "
                    + schemaScore(bestScore, students[count]));
        }
    }

    public static char schemaScore(int bestScore, int grade){
        if (grade >= bestScore - 10){
            return 'A';
        }
        else if (grade >= bestScore - 20){
            return 'B';
        }
        else if (grade >= bestScore - 30){
            return 'C';
        }
        else if (grade >= bestScore - 40){
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
