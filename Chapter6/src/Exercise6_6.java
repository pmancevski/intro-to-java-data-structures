import java.util.Scanner;

public class Exercise6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        displayPattern(number);
    }

    public static void displayPattern(int n) {
        int whiteSpace = n;

        for (int count = 1; count <= n; count++) {
            // white spaces loop
            for (int leftWhite = 0; leftWhite < whiteSpace; leftWhite++) {
                System.out.printf("%3s", " ");
            }

            whiteSpace--;

            for (int num = count; num >= 1; num--) {
                System.out.printf("%3d", num);
            }

            System.out.println();

        }
    }
}
