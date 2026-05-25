package Exercise20_2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        boolean run = true;

        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.print("Enter 10 numbers: ");
        while (numbers.size() < 10) {
            int number = input.nextInt();

            if (!numbers.contains(number)) {
                numbers.add(number);
            }
            else {
                System.out.println(number + " is already in the list. Try again.");
            }
        }

        while (run) {
            System.out.println("1. Sort\n2. Shuffle\n3. Reverse\n4. Exit");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    Collections.sort(numbers);
                    printList(numbers);
                }
                case 2 -> {
                    Collections.shuffle(numbers);
                    printList(numbers);
                }
                case 3 -> {
                    Collections.reverse(numbers);
                    printList(numbers);
                }
                case 4 -> {
                    run = false;
                }
            }
        }

    }

    public static void printList(LinkedList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n");
    }
}
