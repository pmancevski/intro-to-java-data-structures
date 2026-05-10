package Exercise10_5;

import Utils.StackOfIntegers;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        StackOfIntegers stack = new StackOfIntegers();

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int temp = number;
        for (int count = 2; count <= temp; count++) {
            while (temp % count == 0) {
                stack.push(count);
                temp /= count;
            }
        }

        System.out.print("Smallest factors in decreasing order: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
