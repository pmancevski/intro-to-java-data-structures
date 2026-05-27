import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise21_8 {
    public static void main(String[] args) {
        String filePath = "Chapter21\\src\\utils\\test.txt";

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File doesn't exist");
            System.exit(1);
        }

        Map<String, Integer> map = new TreeMap<>();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String line = input.nextLine().toLowerCase();

                String[] words = line.split("[\\s\\p{P}'\"]+");

                for (String word : words) {
                    if (!word.isEmpty() && Character.isLetter(word.charAt(0))) {
                        if (!map.containsKey(word)) {
                            map.put(word, 1);
                        }
                        else {
                            map.put(word, map.get(word) + 1);
                        }
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        map.forEach((k, v) -> System.out.printf("%10s%10d%n", k, v));
    }
}
