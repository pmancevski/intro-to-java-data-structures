package Exercise12_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java App <file-name>");
            System.exit(1);
        }

        String fileName = args[0];

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File doesn't exist");
            System.exit(0);
        }

        try (Scanner input = new Scanner(file); PrintWriter output = new PrintWriter(file)) {
            ArrayList<String> strings = new ArrayList<>();

            // read line by line
            while (input.hasNextLine()) {
                String line = input.nextLine();

                strings.add(line);
            }

            for (int count = strings.size() - 1; count > 0 ; count--) {
                if (strings.get(count).trim().equals("{")) {
                    String prev = strings.get(count - 1);
                    if (!prev.endsWith("{")) {
                        strings.set(count - 1, prev + " {");
                        strings.remove(count);
                    }
                }
            }

            for (String string : strings) {
                output.println(string);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
