public class Exercise5_6 {
    public static void main(String[] args) {
        System.out.println("Miles    Kilometers   |   Kilometers    Miles");

        int kilometers = 20;
        for (int count = 1; count <= 10; count++) {
            System.out.printf("%-10d %6.3f     |%8d%15.3f%n", (count), (count * 1.609), kilometers, (kilometers / 1.609));
            kilometers += 5;
        }
    }
}
