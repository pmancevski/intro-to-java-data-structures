package Exercise17_15;

import java.io.*;

public class App {
    public static void main(String[] args) {

        //        if (args.length != 2) {
//            System.err.println("Usage: java App <input file> <output file>");
//        }
//
//        File inputFile = new File(args[0]);
//        File outputFile = new File(args[1]);

        File inputFile = new File("Chapter17\\src\\Exercise17_14\\output.dat");
        File outputFile = new File("Chapter17\\src\\Exercise17_15\\output.txt");

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(inputFile));
             BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(outputFile))){

            int byteRead = 0;

            while ((byteRead = input.read()) != -1) {
                output.write(byteRead - 5);

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
