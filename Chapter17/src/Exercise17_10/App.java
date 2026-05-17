package Exercise17_10;

import java.io.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

//        if (args.length != 2) {
//            System.err.println("Usage: java App <input-file> <number-of-pieces>");
//            System.exit(1);
//        }

        File file = new File("Chapter17\\src\\Exercise17_10\\test.txt");

        String inputFilePath = "Chapter17\\src\\Exercise17_10\\test.txt";
        long numberOfPieces = 3;

        // create ~ 75MB file
//        try (PrintWriter outputStream = new PrintWriter(file)){
//            for (long count = 0; count < 10000000; count++){
//                outputStream.write(Long.toString(count) + " ");
//
//                if ((count + 1) % 20 == 0){
//                    outputStream.write("\n");
//                }
//            }
//        }
//        catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        String inputFilePath = args[0];
//        int numberOfPieces = Integer.parseInt(args[1]);

        File inputFile = new File(inputFilePath);

        int pieceSize = (int)(inputFile.length() / numberOfPieces);
        int lastPieceSize = (int)(inputFile.length() - ((numberOfPieces - 1) * pieceSize));

        // 16KB
        byte[] buffer = new byte[16384];

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(inputFile))) {

            for (int count = 1; count <= numberOfPieces; count++) {
                int bytesToWrite = (count == numberOfPieces) ? lastPieceSize : pieceSize;

                try (BufferedOutputStream outputStream = new BufferedOutputStream(
                        new FileOutputStream(inputFile.getParent() + File.separator + "SourceFile." + count))) {
                    while (bytesToWrite > 0) {
                        int bytesToRead = inputStream.read(buffer, 0, Math.min(buffer.length, bytesToWrite));
                        outputStream.write(buffer, 0, bytesToRead);
                        bytesToWrite -= bytesToRead;
                    }
                }
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
