import java.util.Locale;
import java.util.Scanner;

public class Exercise5_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        String prefixString = "";

        for (int count = 0; count < Math.min(str1.length(), str2.length()); count++){
            if (str1.charAt(count) == str2.charAt(count)){
                prefixString += str1.charAt(count);
            }
            else {
                break;
            }
        }

        if (!prefixString.isEmpty()) {
            System.out.println("The common prefix is " + prefixString);
        } else {
            System.out.println(str1 + " and " + str2 + " have no common prefix");
        }
    }
}
