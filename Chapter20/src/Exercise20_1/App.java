package Exercise20_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        File file = new File("Chapter20\\src\\Exercise20_1\\someFile.txt");

        if (!file.exists()) {
            System.out.println("File doesn't exist");
            System.exit(1);
        }

        ArrayList<String> words = new ArrayList<>();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String word = input.next();

                if (Character.isLetter(word.charAt(0))) {
                    words.add(word);
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(words);

        for (int count = 0; count < words.size(); count++) {
            System.out.print(words.get(count) + " ");

            if ((count + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
