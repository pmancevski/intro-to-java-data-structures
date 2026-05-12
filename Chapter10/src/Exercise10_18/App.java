package Exercise10_18;

import java.math.BigInteger;

public class App {
    public static void main(String[] args) {
        BigInteger start = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);

        int count = 0;

        while (count < 5){

            if (isPrime(start)){
                System.out.println(start);
                count++;
            }

            start = start.add(BigInteger.ONE);
        }
    }

    public static boolean isPrime(BigInteger number) {
        BigInteger count = BigInteger.TWO;

        while (count.compareTo(number.sqrt()) <= 0){
            if (number.mod(count).equals(BigInteger.ZERO)){
                return false;
            }

            count = count.add(BigInteger.ONE);
        }

        return true;
    }
}
