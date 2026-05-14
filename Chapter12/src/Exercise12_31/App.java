package Exercise12_31;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        userInput.useLocale(Locale.US);

        System.out.print("Enter the year: ");
        int year = userInput.nextInt();
        System.out.print("Enter the gender: ");
        char gender = userInput.next().toUpperCase().charAt(0);
        System.out.print("Enter the name");
        String name = userInput.next();

        if (year < 2001 || year > 2010) {
            System.out.println("There are no records for " + year + " year");
            System.exit(1);
        }

        if (!(gender == 'M' || gender == 'F')) {
            System.out.println("Invalid gender");
            System.exit(1);
        }

        String urlString = "https://liveexample.pearsoncmg.com/data/babynamesranking" + year + ".txt";

        ArrayList<String> lines = new ArrayList<String>();

        try  {
            URL url = new URL(urlString);

            Scanner input = new Scanner(url.openStream());

            while (input.hasNextLine()) {
                lines.add(input.nextLine());
            }

            input.close();
        }
        catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        String tempLine = "";

        for (String line : lines) {
            // this could produce wrong results
            if (line.contains(name)){
                tempLine = line;
                break;
            }
        }

        System.out.println(tempLine);

        if (!tempLine.isEmpty()) {
            String[] tempArray = tempLine.split("\\s+");
            String tempName = (gender == 'M') ? tempArray[1].trim() : tempArray[3].trim();

            System.out.println(tempName + " is ranked #" + tempArray[0] + " in year " + year);
        }
        else {
            System.out.println("The name " + name + " is not ranked in year " + year);
        }
    }
}
