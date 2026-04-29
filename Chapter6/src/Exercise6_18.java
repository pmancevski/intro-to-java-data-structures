import java.util.Scanner;

public class Exercise6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your password: ");
        String password = input.nextLine();

        if (checkLength(password) && containLettersAndDigits(password) && containTwoDigits(password)){
            System.out.println("Valid password");
        }
        else{
            System.out.println("Invalid password");
        }
    }

    public static boolean checkLength(String password){
        return password.length() >= 8;
    }

    public static boolean containLettersAndDigits(String password){

        for (int i = 0; i < password.length(); i++){
            if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))){
                return false;
            }
        }

        return true;
    }

    public static boolean containTwoDigits(String password){
        int countDigits = 0;

        for (int count = 0; count < password.length(); count++){
            if (Character.isDigit(password.charAt(count))){
                countDigits++;
            }
        }

        return countDigits >= 2;
    }
}
