package Exercise12_30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.print("Enter the file name: ");
//        String fileName = userInput.nextLine();

        String fileName = "Chapter12\\src\\Exercise12_30\\test.txt";

        File file = new File(fileName);

        if(!file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        int[] letterOccurrences = new int[26];

        try (Scanner input = new Scanner(file)) {

            while(input.hasNextLine()) {
                String line = input.nextLine().toLowerCase();

                for(int count = 0; count < line.length(); count++) {
                    if (Character.isLetter(line.charAt(count))) {
                        letterOccurrences[line.charAt(count)-'a']++;
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (int count = 0; count < letterOccurrences.length; count++) {
            System.out.println("Number of " + (char)(count + 65) + "s: " + letterOccurrences[count]);
        }
    }
}
