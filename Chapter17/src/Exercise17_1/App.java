package Exercise17_1;

import java.io.*;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        File file = new File("Chapter17\\src\\Exercise17_1\\Exercise17_01.txt");

        try (PrintWriter output = new PrintWriter(new FileWriter(file, true))) {
            for (int count = 0; count < 100; count++) {
                output.print((random.nextInt(100) + 1) + " ");
            }

            output.println();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
