package Exercise17_14;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

//        if (args.length != 2) {
//            System.err.println("Usage: java App <input file> <output file>");
//        }
//
//        File inputFile = new File(args[0]);
//        File outputFile = new File(args[1]);

        File inputFile = new File("Chapter17\\src\\Exercise17_14\\input.txt");
        File outputFile = new File("Chapter17\\src\\Exercise17_14\\output.dat");

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(inputFile));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(outputFile))){

            int byteRead = 0;

            while ((byteRead = input.read()) != -1) {
                output.write(byteRead + 5);

            }
        }
    }
}
