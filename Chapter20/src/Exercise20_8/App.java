package Exercise20_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Generate a lottery number
        int lottery = (int) (Math.random() * 900) + 100;
        int tempLottery = lottery;

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryDigit3 = lottery % 10;
        lottery /= 10;
        int lotteryDigit2 = lottery % 10;
        int lotteryDigit1 = (lottery / 10) % 10;

        // Get digits from guess
        int guessDigit3 = guess % 10;
        guess /= 10;
        int guessDigit2 = guess % 10;
        int guessDigit1 = (guess / 10) % 10;

        System.out.println("The lottery number is " + tempLottery);

        // Store digits in ArrayLists
        ArrayList<Integer> lotteryDigits = new ArrayList<>();
        lotteryDigits.add(lotteryDigit1);
        lotteryDigits.add(lotteryDigit2);
        lotteryDigits.add(lotteryDigit3);

        ArrayList<Integer> guessDigits = new ArrayList<>();
        guessDigits.add(guessDigit1);
        guessDigits.add(guessDigit2);
        guessDigits.add(guessDigit3);

        Collections.sort(lotteryDigits);
        Collections.sort(guessDigits);

        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (lotteryDigits.equals(guessDigits)) {
            System.out.println("Match all digits: you win $3,000");
        }
        else if (lotteryDigits.containsAll(guessDigits.subList(0, 2))) {
            System.out.println("Match two digits: you win $2,000");
        }
        else if (lotteryDigits.contains(guessDigit1) ||
                lotteryDigits.contains(guessDigit2) ||
                lotteryDigits.contains(guessDigit3)) {
            System.out.println("Match one digit: you win $1,000");
        }
        else
            System.out.println("Sorry, no match");
    }
}
