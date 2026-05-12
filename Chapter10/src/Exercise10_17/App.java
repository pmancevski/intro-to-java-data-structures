package Exercise10_17;

import java.math.BigInteger;

public class App {
    public static void main(String[] args) {
        long sqrtMax = (long) Math.sqrt(Long.MAX_VALUE);
        BigInteger start = BigInteger.valueOf(sqrtMax + 1);

        int count = 0;
        while (count < 10) {
            BigInteger square = start.multiply(start);
            System.out.println(square);
            start = start.add(BigInteger.ONE);
            count++;
        }
    }
}
