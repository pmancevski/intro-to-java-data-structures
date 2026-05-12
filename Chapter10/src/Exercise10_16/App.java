package Exercise10_16;

import java.math.BigInteger;

public class App {
    public static void main(String[] args) {

        BigInteger integer = BigInteger.TEN.pow(49);

        int count = 0;

        while (count < 10){
            if (integer.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO) ||
                    integer.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)){

                System.out.println(integer);
                count++;
            }

            integer = integer.add(BigInteger.ONE);
        }
    }
}
