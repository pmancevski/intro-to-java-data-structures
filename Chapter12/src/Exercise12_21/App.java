package Exercise12_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        File file = new File("Chapter12\\src\\Exercise20_21\\SortedStrings.txt");

        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(0);
        }

        ArrayList<String> words = new ArrayList<>();

        try (Scanner input = new Scanner(file)){
            while (input.hasNextLine()) {
                String line = input.nextLine();

                String[] tempWords = line.split("\\s+");

                for (String word : tempWords) {
                    words.add(word);
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String outOfOrder = "";
        boolean isOutOfOrder = false;

        for (int count = 0; count < words.size() - 1; count++) {
            if (words.get(count).compareTo(words.get(count + 1)) > 0) {
                outOfOrder = words.get(count) + " " + words.get(count + 1);
                isOutOfOrder = true;
                break;
            }
        }

        if (isOutOfOrder) {
            System.out.println("The words are not sorted: First two strings: " + outOfOrder);
        }
        else  {
            System.out.println("The words are sorted");
        }
    }
}
