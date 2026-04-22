public class Exercise5_33 {
    public static void main(String[] args) {

        for (int count = 1; count <= 10000; count++) {
            int sumDivisors = 0;

            for (int divisors = 1; divisors < count; divisors++) {
                if (count % divisors == 0) {
                    sumDivisors += divisors;
                }
            }

            if (sumDivisors == count) {
                System.out.println(count + " = " + sumDivisors);
            }
        }
    }
}
