import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Exercise21_4 {
    public static void main(String[] args) {
        String filePath = "Chapter21\\src\\utils\\test.txt";
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        Set<Character> vowels = new HashSet<Character>(Arrays.asList('A', 'E', 'I', 'O', 'U'));

        ArrayList<Character> consonantsCount = new ArrayList<>();
        ArrayList<Character> vowelsCount = new ArrayList<>();

        try (Scanner input = new Scanner(file)){
            while (input.hasNext()) {
                String word = input.next().toUpperCase();

                for (char c : word.toCharArray()) {
                    if (vowels.contains(c)) {
                        vowelsCount.add(c);
                    }
                    else {
                        consonantsCount.add(c);
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Vowel count: " + vowelsCount.size());
        System.out.println("Consonant count: " + consonantsCount.size());
    }
}
