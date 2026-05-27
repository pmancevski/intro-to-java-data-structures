import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

// i butchered this code, its not fully functional, missing literals
public class Exercise21_5 {
    public static void main(String[] args) {
        String inputFilePath = "Chapter21\\src\\utils\\Welcome.java";
        String outputFilePath = "Chapter21\\src\\utils\\Welcome.html";

        File inputFile = new File(inputFilePath);
        File outputFile = new File(outputFilePath);

        if (!inputFile.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        ArrayList<String> linesSourceCode = new ArrayList<>();

        try (Scanner input = new Scanner(inputFile)){
            while (input.hasNextLine()) {
                linesSourceCode.add(input.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        StringBuilder htmlString = createHTMLFile(linesSourceCode);

        try (PrintWriter output = new PrintWriter(outputFile)) {
            output.print(htmlString);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static StringBuilder createHTMLFile (ArrayList<String> lineJavaSourceCode){
        boolean isBlockComment = false;
        StringBuilder htmlStructure = new StringBuilder();

        htmlStructure.append("<!DOCTYPE html>").append("\n");
        htmlStructure.append("<html>").append("\n");
        htmlStructure.append("\t<head>").append("\n");
        htmlStructure.append("\t</head>").append("\n");
        htmlStructure.append("\t<body>").append("\n");
        htmlStructure.append("\t\t<pre><code>\n");

        for (String line : lineJavaSourceCode) {

            if (line.contains("/*")) {
                isBlockComment = true;
            }
            else if (line.contains("*/")){
                isBlockComment = false;
            }

            String temp = javaSourceCodeToHtml(line, isBlockComment);

            htmlStructure.append(temp).append("\n");

        }

        htmlStructure.append("\t\t</code></pre>\n");
        htmlStructure.append("\t</body>").append("\n");
        htmlStructure.append("</html>").append("\n");

        return htmlStructure;
    }

    public static String javaSourceCodeToHtml(String line, boolean isBlockComment) {
        StringBuilder stringBuilder = new StringBuilder();

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
        ArrayList<String> keyWordList = new ArrayList<>(Arrays.asList(line.trim().split(" ")));
        keyWordList.retainAll(keywordSet);

        if (line.contains("//")) {
            int startIndex = line.indexOf("//");

            if (startIndex == 0) {
                stringBuilder.append("<span style=\"color: green;\">").append(line).append("</span>");
            }
            else {
                String tempLine = line.substring(0, startIndex);

                for (String keyWord : keyWordList) {
                    tempLine = tempLine.replace(keyWord,
                            ("<span style=\"font-weight: bold; color: #101372;\">" + keyWord + "</span>"));
                }

                stringBuilder
                        .append(tempLine)
                        .append("<span style=\"color: green;\">")
                        .append(line.substring(startIndex))
                        .append("</span>");
            }
        }
        else if (line.contains("/*") || line.contains("*/") || isBlockComment) {
            stringBuilder
                    .append("<span style=\"color: green;\">")
                    .append(line)
                    .append("</span>");
        }
        else {
            for (String keyWord : keyWordList) {
                line = line.replace(keyWord,
                        ("<span style=\"font-weight: bold; color: #101372;\">" + keyWord + "</span>"));
            }

//            if (line.contains("\"")){
//                int startIndex = line.indexOf("\"");
//                int endIndex = line.indexOf("\"", startIndex + 1);
//
//                String temp = line.substring(startIndex, endIndex + 1);
//
//                line = line.replace(temp,
//                        ("<span color: blue;\">" + temp + "</span>"));
//            }
        }

        return stringBuilder.toString().isEmpty() ? line : stringBuilder.toString();
    }
}
