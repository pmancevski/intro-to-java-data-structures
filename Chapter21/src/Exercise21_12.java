import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Exercise21_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a file name for baby name ranking: ");
        String fileName = input.nextLine();

//        System.out.println();
//        String fileName = "babynamesranking2001.txt";

        String urlString = "https://liveexample.pearsoncmg.com/data/" + fileName;

        ArrayList<String> maleNames = new ArrayList<>();
        ArrayList<String> femaleNames = new ArrayList<>();

        try {
            URL url = new URL(urlString);

            Scanner urlInput = new Scanner(url.openStream());

            while (urlInput.hasNextLine()) {
                String line = urlInput.nextLine();

                String[] lineSplit = line.split("\\s+");

                maleNames.add(lineSplit[1]);
                femaleNames.add(lineSplit[3]);
            }

            input.close();
        }
        catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        Set<String> maleNamesSet = new HashSet<>(maleNames);
        maleNamesSet.retainAll(femaleNames);

        System.out.print(maleNamesSet.size() + " names used for both genders\nThey are ");

        int count = 0;
        for (String maleName : maleNamesSet) {
            System.out.print(maleName + " ");
            count++;

            if (count % 15 == 0) {
                System.out.println();
            }
        }
    }
}
