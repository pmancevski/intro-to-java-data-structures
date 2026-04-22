public class Exercise5_25 {
    public static void main(String[] args) {

        for (int i = 10000; i <= 100000; i += 10000) {
            double pi = 0;

            for (int count = 1; count <= i; count++) {
                if (count % 2 == 1) {
                    pi += 1.0 / (2 * count - 1);
                } else {
                    pi -= 1.0 / (2 * count - 1);
                }
            }

            pi *= 4;
            System.out.println("For i = " + i + ", pi = " + pi);
        }
    }
}
