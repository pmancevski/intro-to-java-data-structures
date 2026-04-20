import java.util.Locale;
import java.util.Scanner;

public class Exercise5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int highestScore = 0;
        String studentHighestScore = "";
        int secondHighestScore = 0;
        String studentSecondHighestScore = "";

        System.out.print("Please enter number of students: ");
        int numberOfStudents = input.nextInt();

        while (numberOfStudents > 0){
            System.out.print("Please enter the name and score of the student: ");
            String studentName = input.next();
            int score = input.nextInt();

            if (secondHighestScore < score){
                if (highestScore < score) {
                    // swap first to second
                    secondHighestScore = highestScore;
                    studentSecondHighestScore = studentHighestScore;

                    // replace first with input
                    highestScore = score;
                    studentHighestScore = studentName;
                }
                else {
                    secondHighestScore = score;
                    studentSecondHighestScore = studentName;
                }
            }

            numberOfStudents--;
        }

        System.out.println("Student with highest score: " + studentHighestScore + ", score: " + highestScore);
        System.out.println("Student with second highest score: " + studentSecondHighestScore + ", score: "
                + secondHighestScore);
    }
}
