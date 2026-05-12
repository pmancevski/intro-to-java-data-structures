package Exercise10_20;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
    public static void main(String[] args) {
        BigDecimal e = BigDecimal.ONE;
        BigDecimal factorial = BigDecimal.ONE;

        for (int i = 1; i <= 20; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
            BigDecimal term = BigDecimal.ONE.divide(factorial, 25, RoundingMode.HALF_UP);
            e = e.add(term);
        }

        System.out.println("e = " + e);

    }
}
