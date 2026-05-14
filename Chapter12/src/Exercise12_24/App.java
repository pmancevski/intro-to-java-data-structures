package Exercise12_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        String[] ranks = {"assistant", "associate", "full"};
        Random random = new Random();
        ArrayList<String> lines = new ArrayList<>();

        for (int count = 0; count < 1000; count++) {
            String tempRank = ranks[random.nextInt(ranks.length)];
            String line = "FirstName" + (count + 1) + " LastName" + (count + 1)
                    + " " + tempRank + " " + randomSalaryBasedOnRank(tempRank, random);

            lines.add(line);
        }

        File file = new File("Chapter12\\src\\Exercise12_24\\Salary.txt");

        try (PrintWriter out = new PrintWriter(file)) {
            for (String line : lines) {
                out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static double randomSalaryBasedOnRank(String rank, Random random) {
        double salary = 0;

        switch (rank) {
            case "assistant" -> {
                salary = 50000 + random.nextDouble() * 30000;
                salary = Math.round(salary * 100) / 100.0;
            }
            case "associate" -> {
                salary = 60000 + random.nextDouble() * 50000;
                salary = Math.round(salary * 100) / 100.0;
            }
            case "full" -> {
                salary = 75000 + random.nextDouble() * 55000;
                salary = Math.round(salary * 100) / 100.0;
            }
            default -> {
                System.out.println("Invalid rank");
                System.exit(0);
            }
        }

        return salary;
    }
}
