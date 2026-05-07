import java.util.Locale;
import java.util.Scanner;

public class Exercise7_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        String[] animalNames = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit",
                "dragon", "snake", "horse", "sheep"};

        System.out.print("Enter a year: ");
        System.out.println(animalNames[input.nextInt() % 12]);
    }
}
