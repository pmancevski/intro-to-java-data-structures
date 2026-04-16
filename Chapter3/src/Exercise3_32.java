import java.util.Locale;
import java.util.Scanner;

public class Exercise3_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double check = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);

        if (check > 0){
            System.out.println("p2 is on the left side of the line");
        }
        else if (check == 0){
            System.out.println("p2 is on the same line");
        }
        else{
            System.out.println("p2 is on the right side of the line");
        }
    }
}
