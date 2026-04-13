import java.util.Locale;
import java.util.Scanner;

public class Exercise3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int computerHand = (int)(Math.random() * 3);
        String computerHandString = switch (computerHand) {
            case 0 -> "scissor";
            case 1 -> "rock";
            case 2 -> "paper";
            default -> "";
        };

        System.err.println("Computer Hand: (" + computerHand + ") " + computerHandString);

        System.out.print("Pick one integer. scissor (0), rock (1), paper (2): ");
        int guess = input.nextInt();

        String guessHandString = switch (guess) {
            case 0 -> "scissor";
            case 1 -> "rock";
            case 2 -> "paper";
            default -> "";
        };

        if (guess == computerHand) {
            System.out.println("The computer is " + computerHandString + ". You are "
                    + guessHandString + " too. It is a draw");
        }
        else if ((computerHandString == "scissor" && guessHandString == "paper")
                || (computerHandString == "rock" &&  guessHandString == "scissor")
                || (computerHandString == "paper" && guessHandString == "rock")) {
            System.out.println("The computer is " + computerHandString + ". You are "
                    + guessHandString + ". You lose");
        }
        else {
            System.out.println("The computer is " + computerHandString + ". You are "
                    + guessHandString + ". You won");
        }
    }
}
