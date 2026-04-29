public class Exercise6_13 {
    public static void main(String[] args) {
        System.out.printf("%3s%10s%n", "i", "m(i)");

        double sum = 0.0;
        for (int count = 1; count <= 20; count++) {
            sum += computeSummation(count);
            System.out.printf("%3d%12.4f%n", count, sum);
        }
    }

    public static double computeSummation(int number){
        return number / (number + 1.0);
    }
}
