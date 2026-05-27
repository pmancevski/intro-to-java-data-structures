public class Exercise22_6 {
    public static void main(String[] args) {

        System.out.printf("%30s%5d%5d%5d%5d%5d%5d%n", "|", 40, 41, 42, 43, 44, 45);
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-20s%10s", "Listing 22.3 GCD ", "|");

        for (int count = 40; count <= 45; count++){

            long startTime = System.currentTimeMillis();
            gcd(fib(count), fib(count + 1));
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;

            System.out.printf("%5d", executionTime);
        }

        System.out.printf("%n%-20s%7s", "Listing 22.4 GCDEuclid ", "|");

        for (int count = 40; count <= 45; count++){

            long startTime = System.currentTimeMillis();
            GCDEuclid(fib(count), fib(count + 1));
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;

            System.out.printf("%5d", executionTime);
        }
    }

    public static int gcd(int m, int n) {
        int gcd = 1;

        if (m % n == 0) return n;

        for (int k = n / 2; k >= 1; k--) {
            if (m % k == 0 && n % k == 0) {
                gcd = k;
                break;
            }
        }

        return gcd;
    }

    public static int GCDEuclid(int m, int n) {
        if (m % n == 0)
            return n;
        else
            return GCDEuclid(n, m % n);
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
