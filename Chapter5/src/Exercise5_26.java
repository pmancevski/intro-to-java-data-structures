public class Exercise5_26 {
    public static void main(String[] args) {
        double e = 1.0;

        for (int i = 1; i <= 20; i++) {
            int factor = 1;

            for (int countFactors = 1; countFactors <= i; countFactors++) {
                factor *= countFactors;
            }

            e += 1.0 / factor;
            //System.out.println("i = " + i + ", factor = " + factor);
        }

        System.out.println("e = " + e);
    }
}
