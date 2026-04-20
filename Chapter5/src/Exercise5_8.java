import java.util.Locale;
import java.util.Scanner;

public class Exercise5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int highestScore = 0;
        String studentHighestScore = "";

        System.out.print("Please enter number of students: ");
        int numberOfStudents = input.nextInt();

        while (numberOfStudents > 0){
            System.out.print("Please enter the name and score of the student: ");
            String studentName = input.next();
            int score = input.nextInt();

            if (highestScore < score){
                highestScore = score;
                studentHighestScore = studentName;
            }

            numberOfStudents--;
        }

        System.out.println("Student with highest score: " + studentHighestScore + ", score: " + highestScore);
    }
}
