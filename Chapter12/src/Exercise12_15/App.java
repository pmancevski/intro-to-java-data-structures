package Exercise12_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        File file = new File("Chapter12\\src\\Exercise12_15\\Exercise12_15.txt");

        if (!file.exists()) {
            System.out.println("File doesn't exist");

            try {
                if (file.createNewFile()) {
                    System.out.println("File was created");
                }
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (PrintWriter output = new PrintWriter(file)) {
            Random random = new Random();

            for (int count = 0; count < 100; count++) {
                output.print(random.nextInt(100));
                output.print(' ');
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()){
                numbers.add(input.nextInt());
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (int count = numbers.size() - 1; count >= 0; count--) {
            System.out.print(numbers.get(count) + " ");
        }
    }
}
