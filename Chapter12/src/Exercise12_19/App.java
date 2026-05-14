package Exercise12_19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String urlString = "https://liveexample.pearsoncmg.com/data/Lincoln.txt";

        int countWords = 0;

        try {
            URL url = new URL(urlString);

            Scanner input = new Scanner(url.openStream());

            while (input.hasNextLine()) {
                String line = input.nextLine();

                line = line.replace('-', ' ');

                String[] words = line.split("\\s+");

                countWords += words.length;
            }

        }
        catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Words: " + countWords);
    }
}
