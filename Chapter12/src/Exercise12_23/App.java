package Exercise12_23;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String urlString = "https://liveexample.pearsoncmg.com/data/Scores.txt";

        ArrayList<Integer> scores = new ArrayList<>();

        try {
            URL url = new URL(urlString);

            Scanner input = new Scanner(url.openStream());

            while (input.hasNextLine()) {
                String line = input.nextLine();

                String[] scoresString = line.split(" ");

                for (String s : scoresString) {
                    scores.add(Integer.parseInt(s));
                }
            }
        }
        catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        int total = 0;

        for (Integer score : scores) {
            total += score;
        }

        System.out.println("Total scores: " + total + "\nAverage: " + (total / (double)scores.size()));
    }
}
