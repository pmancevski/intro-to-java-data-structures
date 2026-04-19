public class Exercise5_3 {
    public static void main(String[] args) {
        System.out.println("Kilograms    Pounds");
        for (int count = 1; count <= 200; count+=2) {
            System.out.printf("%-10d %6.1f%n", (count), (count * 2.2));
        }
    }
}
