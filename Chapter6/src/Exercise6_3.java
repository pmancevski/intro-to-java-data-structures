import java.util.Scanner;

public class Exercise6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Number " + num + (isPalindrome(num) ? " is a palindrome." : " is NOT a palindrome."));
    }

    public static int reverse(int number){
        String numberString = Integer.toString(number);
        String reverseString = "";

        for (int count = numberString.length() - 1; count >= 0; count--) {
            reverseString += numberString.charAt(count);
        }

        return  Integer.parseInt(reverseString);
    }

    public static boolean isPalindrome(int number){

        return number == reverse(number);
    }
}
