package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestJavaSourceFile {
    public static void main(String[] args) {
        //mimicking args[0]
        String filePath = "Chapter21\\src\\utils\\test.txt";

        File file = new File(filePath);

        /*
        testing parragrapgh key words public class import
         */

        /* void */

        // instanceof some comment with keyword for testing
        //package testing word to start with //
        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        Set<String> strings = new TreeSet<>();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                strings.add(input.next());
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int count = 1;
        for (String string : strings) {
            System.out.print(string + " ");

            if (count % 15 == 0) {
                System.out.println();
            }

            count++;
        }
    }
}
