import java.util.Locale;
import java.util.Scanner;

public class Exercise4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the first city: ");
        String city = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        if (city.compareTo(city2) <= 0 && city.compareTo(city3) <= 0) {
            if (city2.compareTo(city3) <= 0) {
                System.out.printf("The three cities in alphabetical order are: %s, %s, %s%n",
                        city, city2, city3);
            }
            else {
                System.out.printf("The three cities in alphabetical order are: %s, %s, %s%n",
                        city, city3, city2);
            }
        }
        else if (city2.compareTo(city) <= 0 && city2.compareTo(city3) <= 0) {
            if (city.compareTo(city3) <= 0) {
                System.out.printf("The three cities in alphabetical order are: %s, %s, %s%n",
                        city2, city, city3);
            }
            else {
                System.out.printf("The three cities in alphabetical order are: %s, %s, %s%n",
                        city2, city3, city);
            }
        }
        else {
            if (city.compareTo(city2) <= 0){
                System.out.printf("The three cities in alphabetical order are: %s, %s, %s%n",
                        city3, city, city2);
            }
            else {
                System.out.printf("The three cities in alphabetical order are: %s, %s, %s%n",
                        city3, city2, city);
            }
        }
    }
}
