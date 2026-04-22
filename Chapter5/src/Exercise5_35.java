public class Exercise5_35 {
    public static void main(String[] args) {
        double sum = 0;
        for (int count = 1; count < 625; count++) {
            sum += 1.0 / (Math.sqrt(count) + Math.sqrt(count + 1));
        }

        System.out.println("The sum is " + sum);
    }
}
