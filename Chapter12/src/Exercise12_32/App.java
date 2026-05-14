package Exercise12_32;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Year Rank 1     Rank 2     Rank 3     Rank 4     Rank 5     " +
                "Rank 1     Rank 2     Rank 3     Rank 4     Rank 5");

        for (int year = 2010; year >= 2001; year--){
            String urlString = "https://liveexample.pearsoncmg.com/data/babynamesranking" + year + ".txt";

            try  {
                URL url = new URL(urlString);

                Scanner input = new Scanner(url.openStream());

                String[][] matrixPerYear = new String[5][5];

                for (int rank = 1; rank <= 5; rank++){
                    matrixPerYear[rank - 1] = input.nextLine().split("\\s+");
                }

                System.out.print(year);

                for (int row = 0; row < matrixPerYear.length; row++){
                    System.out.printf(" %-10s", matrixPerYear[row][3]);
                }

                for (int row = 0; row < matrixPerYear.length; row++){
                    System.out.printf(" %-10s", matrixPerYear[row][1]);
                }

                System.out.println();

                input.close();
            }
            catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
