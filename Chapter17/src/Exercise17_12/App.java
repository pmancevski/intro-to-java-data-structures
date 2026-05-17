package Exercise17_12;

import java.io.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        if (args.length < 2){
            System.err.println("Usage: java App <SourceFile.1> ... <SourceFile.n> <output file>");
            System.exit(1);
        }

        ArrayList<File> listOfFiles = new ArrayList<>();

//        String[] myArgs = new String[4];
//        myArgs[0] = "Chapter17\\src\\Exercise17_10\\SourceFile.1";
//        myArgs[1] = "Chapter17\\src\\Exercise17_10\\SourceFile.2";
//        myArgs[2] = "Chapter17\\src\\Exercise17_10\\SourceFile.3";
//        myArgs[3] = "Chapter17\\src\\Exercise17_12\\test.txt";

        for (int count = 0; count < args.length; count++) {
            listOfFiles.add(new File(args[count]));
        }

        // 16KB
        byte[] buffer = new byte[16384];

        try (BufferedOutputStream outputStream = new BufferedOutputStream(
                new FileOutputStream(listOfFiles.getLast()))) {

            for (int count = 0; count < listOfFiles.size() - 1; count++) {
                File file = listOfFiles.get(count);

                long bytesToWrite = file.length();

                try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
                    while (bytesToWrite > 0) {
                        int chunkSize = (int) Math.min(buffer.length, Math.min(bytesToWrite, Integer.MAX_VALUE));
                        int bytesToRead = inputStream.read(buffer, 0, chunkSize);

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
