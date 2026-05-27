import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise21_15 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        Set<Integer> list = new HashSet<>();

        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        list.add(answer);

        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is "
                    + number1 + " + " + number2 + "? ");

            answer = input.nextInt();

            if (list.contains(answer)) {
                System.out.println("You already entered " + answer);
            }

            list.add(answer);
        }

        System.out.println("You got it!");
    }

}
