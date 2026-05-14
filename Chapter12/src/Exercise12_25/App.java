package Exercise12_25;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String urlString = "https://liveexample.pearsoncmg.com/data/Salary.txt";

        ArrayList<String> lines = new ArrayList<>();

        try {
            URL url = new URL(urlString);

            Scanner input = new Scanner(url.openStream());

            while (input.hasNextLine()) {
                lines.add(input.nextLine());
            }
        }
        catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        double sumAll = 0;
        int countAll = 0;

        double sumAssistant = 0;
        int countAssistants = 0;

        double sumAssociate = 0;
        int countAssociate = 0;

        double sumFull = 0;
        int countFull = 0;

        for (String line : lines) {
            String[] employeeInfo = line.split(" ");

            sumAll += Double.parseDouble(employeeInfo[3]);

            switch (employeeInfo[2]){
                case "assistant" -> {
                    countAssistants++;
                    sumAssistant += Double.parseDouble(employeeInfo[3]);
                }
                case "associate" -> {
                    countAssociate++;
                    sumAssociate += Double.parseDouble(employeeInfo[3]);
                }
                case "full" -> {
                    countFull++;
                    sumFull += Double.parseDouble(employeeInfo[3]);
                }
            }

            countAll++;
        }

        System.out.printf("Assistant: %n\tSum: %.2f%n\tAverage: %.2f%n%n", sumAssistant,
                (sumAssistant / (double)countAssistants));
        System.out.printf("Associate: %n\tSum: %.2f%n\tAverage: %.2f%n%n", sumAssociate,
                (sumAssociate / (double)countAssociate));
        System.out.printf("Full: %n\tSum: %.2f%n\tAverage: %.2f%n%n", sumFull,
                (sumFull / (double)countFull));
        System.out.printf("Faculty: %n\tSum: %.2f%n\tAverage: %.2f%n%n", sumAll,
                (sumAll / (double)countAll));
    }
}
