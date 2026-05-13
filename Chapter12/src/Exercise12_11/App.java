package Exercise12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java App <content-to-be-removed> <file-path>");
            System.exit(1);
        }

        String contentToBeRemoved = args[0];
        String filePath = args[1];

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File doesn't exist");
            System.exit(0);
        }

        try (Scanner input = new Scanner(file); PrintWriter output = new PrintWriter(filePath)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();

                line = line.replace(contentToBeRemoved, "").trim();

                output.write(line);
                output.write("\n");

                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
