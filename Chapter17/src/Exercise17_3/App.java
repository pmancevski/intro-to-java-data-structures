package Exercise17_3;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File file = new File("Chapter17\\src\\Exercise17_2\\Exercise17_02.dat");

        int sum = 0;

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(file))){
            while (true) {
                sum += inputStream.readInt();
            }
        }
        catch (EOFException exception) {
            System.out.println("All integers were processed!");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("The sum is: " + sum);
    }
}
