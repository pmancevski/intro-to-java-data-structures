public class Exercise5_4 {
    public static void main(String[] args) {
        System.out.println("Miles    Kilometers");
        for (int count = 1; count <= 10; count++) {
            System.out.printf("%-10d %6.3f%n", (count), (count * 1.609));
        }
    }
}
