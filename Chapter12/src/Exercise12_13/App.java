package Exercise12_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

//        if (args.length != 1) {
//            System.out.println("Usage: java App <file-name>");
//            System.exit(1);
//        }

        String fileName = "Chapter12\\src\\Exercise12_13\\test.txt";

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File doesn't exist");
            System.exit(0);
        }

        int numberOfCharacters = 0;
        int numberOfWords = 0;
        int numberOfLines = 0;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {

                String line = input.nextLine();
                numberOfLines++;

                String[] words = line.split("\\s+");
                numberOfWords += words.length;

                for (int count = 0; count < words.length; count++) {
                    numberOfCharacters += words[count].trim().length();
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File " + file.getName() + " has");
        System.out.println("Number of characters: " + numberOfCharacters);
        System.out.println("Number of words: " + numberOfWords);
        System.out.println("Number of lines: " + numberOfLines);
    }
}
