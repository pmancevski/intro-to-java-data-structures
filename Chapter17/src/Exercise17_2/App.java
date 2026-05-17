package Exercise17_2;

import java.io.*;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        File file = new File("Chapter17\\src\\Exercise17_2\\Exercise17_02.dat");

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(file, true))) {
            for (int count = 0; count < 100; count++) {
                outputStream.writeInt(random.nextInt(100) + 1);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
