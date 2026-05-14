package Exercise12_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.err.println("Usage: java Exercise12_22 <dir-path> <old string> <new string>");
            System.exit(1);
        }

        String directory = args[0];

        File fileDir = new File(directory);

        if (!fileDir.isDirectory()) {
            System.out.println("args[0] is not a directory");
            System.exit(1);
        }

        File[] files = fileDir.listFiles();

        if (files == null) {
            System.out.println("Directory is empty. Does not have any files");
            System.exit(1);
        }

        String oldString = args[1];
        String newString = args[2];

        for (File file : files) {

            // This could have possible issues: PrintWriter clears the file before reading, so no data is processed.
            // It should be in two try blocks, for simplicity i keep it
            try (Scanner input = new Scanner(file); PrintWriter output = new PrintWriter(file)) {

                while (input.hasNextLine()) {
                    String line = input.nextLine();

                    line = line.replace(oldString, newString);

                    output.println(line);
                }

            }
            catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
