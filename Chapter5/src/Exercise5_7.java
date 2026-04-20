public class Exercise5_7 {
    public static void main(String[] args) {
        double tuition = 10000;
        final double RATE = 5.0;
        int count = 1;

        System.out.println("Year     |     Tuition");

        do {
            tuition += tuition * RATE / 100;
            System.out.printf("%2d       |     %5.2f%n", count, (tuition));

            count++;
        }while (count <= 10);
    }
}
