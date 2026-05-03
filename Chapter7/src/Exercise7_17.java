import java.util.Locale;
import java.util.Scanner;

public class Exercise7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String[] studentNames = new String[numberOfStudents];
        int[] studentScores = new int[numberOfStudents];

        for (int count = 0; count < numberOfStudents; count++) {
            System.out.print("Enter student name and score: ");
            studentNames[count] = input.next();
            studentScores[count] = input.nextInt();
        }

        for (int count = 0; count < studentScores.length; count++) {
            int maxIndex = count;
            int maxScore = studentScores[count];
            String maxName = studentNames[count];

            for (int search = count + 1; search < studentScores.length; search++) {
                if (studentScores[search] > maxScore) {
                    maxIndex = search;
                    maxScore = studentScores[search];
                    maxName = studentNames[search];
                }
            }

            if (maxIndex != count) {
                int tempScore = studentScores[maxIndex];
                studentScores[maxIndex] = studentScores[count];
                studentScores[count] = tempScore;

                String tempName = studentNames[maxIndex];
                studentNames[maxIndex] = studentNames[count];
                studentNames[count] = tempName;
            }
        }


        printArray(studentNames, studentScores);
    }

    public static void printArray(String[] array, int[] scores) {
        for (int count = 0; count < array.length; count++){
            System.out.println(array[count] + " - " + scores[count]);
        }
    }
}
