import java.util.Scanner;

public class Exercise6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        reverse(number);
    }

    public static void reverse(int number){
        String numberString = Integer.toString(number);
        String reverseString = "";

        for (int count = numberString.length() - 1; count >= 0; count--) {
            reverseString += numberString.charAt(count);
        }

        System.out.println("Reversed number: " + reverseString);
    }
}
