import java.util.Scanner;

public class Exercise6_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n){

        for (int row = n; row > 0; row--) {
            for (int col = n; col > 0; col--) {
                System.out.print(((int)(Math.random()*2)) + " ");
            }

            System.out.println();
        }
    }
}
