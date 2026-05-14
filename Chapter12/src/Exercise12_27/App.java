package Exercise12_27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


// some cases are not covered, but for this exercise is enough
public class App {
    public static void main(String[] args) {

//        if (args.length != 2){
//            System.out.println("Usage: java <directory> *");
//            System.exit(1);
//        }

        String directoryPath = "Chapter12\\src\\Exercise12_27\\test";

        File directory = new File(directoryPath);

        if (!directory.exists()){
            System.out.println("Directory does not exist!");
            System.exit(1);
        }

        File[] files = directory.listFiles();

        if (files==null){
            System.out.println("Directory is empty!");
            System.exit(1);
        }

        for (File file : files){

            ArrayList<String> lines = new ArrayList<>();

            try (Scanner input = new Scanner(file)){

                while (input.hasNextLine()){
                    String line = input.nextLine();

                    String[] words = line.split(" ");

                    StringBuilder newLine = new StringBuilder();

                    for (int count = 0; count < words.length; count++){
                        if (words[count].trim().contains("Exercise")
                                && words[count].trim().startsWith("Exercise")
                                && Character.isDigit(words[count].trim().charAt(words[count].trim().length() - 1))) {

                            String temp = words[count].substring(8);
                            String[] numbers = temp.split("_");

                            String newNumbers = "";

                            if (numbers[0].length() == 1){
                                newNumbers += "0" + numbers[0];
                            }
                            else {
                                newNumbers += numbers[0];
                            }

                            if (numbers[1].length() == 1){
                                newNumbers += "_0" + numbers[1];
                            }
                            else {
                                newNumbers += "_" + numbers[1];
                            }

                            words[count] = "Exercise" + newNumbers;
                        }

                        newLine.append(words[count]);
                        newLine.append(" ");
                    }

                    lines.add(newLine.toString());
                }
            }
            catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            for (String line : lines) {
                System.out.println(line);
            }

//            try (PrintStream output = new PrintStream(file)){
//
//                for (String line : lines){
//                    output.println(line);
//                }
//            }
//            catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
        }

    }
}
