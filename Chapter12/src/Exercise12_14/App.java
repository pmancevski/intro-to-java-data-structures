package Exercise12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        if (args.length != 1) {
//            System.out.println("Usage: java App <file-name>");
//            System.exit(1);
//        }

        String fileName = "Chapter12\\src\\Exercise12_14\\score.txt";

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File doesn't exist");
            System.exit(0);
        }

        int sum = 0;
        int count = 0;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                sum += input.nextInt();
                count++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total: " + sum);
        System.out.println("Average: " + (sum / (double)count));
    }
}
