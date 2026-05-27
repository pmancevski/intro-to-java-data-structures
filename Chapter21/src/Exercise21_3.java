import java.util.*;
import java.io.*;
// not finished
public class Exercise21_3 {
    public static void main(String[] args) throws Exception {
        String filePath = "Chapter21\\src\\utils\\TestJavaSourceFile.java";

        File file = new File(filePath);
        String fileName = filePath.split("\\\\")[filePath.split("\\\\").length - 1];

        if (file.exists()) {
            System.out.println("The number of keywords in " +
                    fileName
                    + " is " + countKeywords(file));
        } else {
            System.out.println("File " + fileName + " does not exist");
        }
    }

    public static int countKeywords(File file) throws Exception {
        // Array of all Java keywords + true, false and null
        String[] keywordString = {"abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"};

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;

        Scanner input = new Scanner(file);

        ArrayList<String> lines = new ArrayList<>();

        while (input.hasNextLine()) {
            String line = input.nextLine();

            if (line.contains("//")) {
                int startIndex = line.indexOf("//");

                lines.add(line.substring(0, startIndex));
            }

            if (line.contains("/*") && line.contains("*/")) {
                lines.add("");
            }
        }

        return count;
    }
}