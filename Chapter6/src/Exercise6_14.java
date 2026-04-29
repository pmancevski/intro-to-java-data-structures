public class Exercise6_14 {
    public static void main(String[] args) {
        System.out.printf("%3s%10s%n", "i", "m(i)");

        for (int count = 1; count <= 901; count += 100){
            System.out.printf("%3d%12.4f%n", count, computePi(count));
        }
    }

    public static double computePi(int number){
        double sum = 0.0;

        for (int count = 1; count <= number; count++) {
            sum += computeSummation(count);
        }

        return 4 * sum;
    }

    public static double computeSummation(int number){
        return Math.pow((-1), number + 1) / (2.0 * number - 1);
    }
}
