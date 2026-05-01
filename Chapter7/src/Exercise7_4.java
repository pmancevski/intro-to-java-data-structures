import java.util.Locale;
import java.util.Scanner;

public class Exercise7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int[] scores = new int[100];
        int sum = 0;
        double count = 0;

        System.out.print("Enter score: ");
        int score = input.nextInt();

        while (score > 0){
            sum += score;
            scores[score - 1]++;
            count++;

            score = input.nextInt();
        }

        double average = sum / count;
        int aboveAvg = 0;
        int belowAvg = 0;

        for (int index = 0; index < scores.length; index++){
            if (scores[index] == 0){
                continue;
            }

            if (index + 1 >= average){
                aboveAvg += scores[index];
            }
            else {
                belowAvg += scores[index];
            }
        }

        System.out.println("Average score: " + average);
        System.out.println("Above average score: " + aboveAvg);
        System.out.println("Below average score: " + belowAvg);
    }
}
