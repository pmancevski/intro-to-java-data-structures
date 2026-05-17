package Exercise17_16;

import java.io.*;

public class App {
    public static void main(String[] args) {

        File inputFile = new File("Chapter17\\src\\Exercise17_16\\input.txt");

        int[] asciiChars = new int[255];

        try (DataInputStream dataInput = new DataInputStream(new FileInputStream(inputFile))) {
            while (true) {
                int value = dataInput.readUnsignedByte();
                asciiChars[value]++;
            }
        }
        catch (EOFException e) {
            System.out.println();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        // formatting issues but .... its enough for the exercise
        System.out.println("ASCII | Char | Occurrences");
        for (int count = 0; count < asciiChars.length; count++) {

            if (asciiChars[count] != 0) {
                System.out.printf("  %3d |   %c   |   %d%n", count, (char) count, asciiChars[count]);
            }
        }
    }
}
