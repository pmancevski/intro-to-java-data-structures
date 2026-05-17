package Exercise17_4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        File inputFile = new File("Chapter17\\src\\Exercise17_4\\inputFile.txt");
        File outputFile = new File("Chapter17\\src\\Exercise17_4\\outputFile.utf");

        try (Scanner input = new Scanner(inputFile)){
            ArrayList<String> lines = new ArrayList<>();
            while (input.hasNextLine()) {
                String line = input.nextLine();
                lines.add(line);
            }

            try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(outputFile))){
                for (String line : lines) {
                    outputStream.writeUTF(line);
                }
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Size of text file: " + inputFile.length());
        System.out.println("Size of output file: " + outputFile.length());

        // read and output file to console for testing
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(outputFile))) {
            while (true){
                System.out.println( inputStream.readUTF());
            }
        }
        catch (EOFException exception){
            System.out.println("Process reading file finished!");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
