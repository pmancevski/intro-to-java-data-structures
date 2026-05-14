package Exercise12_28;

import java.io.File;

// this solution is not tested, but thats the drill
public class App {
    public static void main(String[] args) {

        File directoryPath = new File("Chapter12\\src\\Exercise12_28\\test");

        File[] files = directoryPath.listFiles();

        if (files==null){
            System.out.println("Directory is empty!");
            System.exit(1);
        }

        for (File file : files) {

            String originalFileName = file.getName();

            String[] fileNameAndExtension = originalFileName.split("\\.");
            String wordToBeReplaced = fileNameAndExtension[0];

            String temp = wordToBeReplaced.substring(8);
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

            String newFileName = "Exercise" + newNumbers + "." + fileNameAndExtension[1];

            if (file.renameTo(new File(directoryPath + File.separator + newFileName))){
                System.out.println("File successfully renamed!");
            }
        }
    }
}
