import java.util.Locale;
import java.util.Scanner;

public class Exercise7_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double[] eqn = new double[3];
        double[] roots = new double[2];

        System.out.print("Enter a, b, c: ");
        eqn[0] = input.nextDouble();
        eqn[1] = input.nextDouble();
        eqn[2] = input.nextDouble();

        int realRoots = solveQuadratic(eqn, roots);

        System.out.println("Equation has #" + realRoots + " roots");

        for (int count = realRoots; count > 0; count--) {
            System.out.println("Root #" + count + " is " + roots[count - 1]);
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots){
        int numberOfRoots;

        double discriminant = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];

        if (discriminant > 0){
            roots[0] = (-eqn[1] + Math.sqrt(discriminant)) / (2 * eqn[0]);
            roots[1] = (-eqn[1] - Math.sqrt(discriminant)) / (2 * eqn[0]);
            numberOfRoots = 2;
        }
        else if (discriminant == 0){
            roots[0] = (-eqn[1] + Math.sqrt(discriminant)) / (2 * eqn[0]);
            numberOfRoots = 1;
        }
        else {
            numberOfRoots = 0;
        }

        return numberOfRoots;
    }
}
