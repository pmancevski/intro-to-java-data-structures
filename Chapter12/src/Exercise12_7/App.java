package Exercise12_7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        try {
            int result = bin2Dec(binary);
            System.out.println("Decimal value: " + result);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int bin2Dec(String binaryString) throws NumberFormatException {
        for (int count = 0; count < binaryString.length(); count++) {
            if (binaryString.charAt(count) != '1' && binaryString.charAt(count) != '0'){
                throw new NumberFormatException("Not a binary number");
            }
        }

        return Integer.parseInt(binaryString, 2);
    }
}
