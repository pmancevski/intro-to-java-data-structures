package Exercise20_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        String filePath = "Chapter20\\src\\Exercise20_10\\App.java";

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        Stack<Character> symbols = new Stack<>();
        boolean javaSourceCodeMatch = true;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();

                for (char c : line.toCharArray()) {
                    if (c == '{' || c == '[' || c == '(') {
                        symbols.push(c);
                    }

                    if (c == '}' || c == ']' || c == ')') {
                        if (symbols.isEmpty()) {
                            javaSourceCodeMatch = false;
                            break;
                        }

                        char check = symbols.pop();

                        if ((check == '{' && c != '}') || (check == '[' && c != ']') || (check == '(' && c != ')')) {
                            javaSourceCodeMatch = false;
                            break;
                        }
                    }
                }

                if (!javaSourceCodeMatch) {
                    break;
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        if (javaSourceCodeMatch && symbols.isEmpty()) {
            System.out.println("Java Source Code \"compile\"");
        }
        else {
            System.out.println("\"Compile error\"");
        }
    }
}
