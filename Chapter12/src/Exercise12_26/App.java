package Exercise12_26;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        //"Chapter12\\src\\Exercise12_26"
        System.out.print("Enter directory: ");
        String directory = input.nextLine();

        File dir = new File(directory);

        if(dir.exists()){
            System.out.println("Directory exists!");
            System.exit(0);
        }
        else {
            boolean wasCreated = dir.mkdirs();
            if(!wasCreated){
                System.out.println("Failed to create directory!");
            }
        }


    }
}
