public class Exercise5_5 {
    public static void main(String[] args) {
        System.out.println("Kilograms    Pounds   |   Pounds    Kilograms");
        int pounds = 20;
        for (int count = 1; count < 200; count+=2){
            System.out.printf("%-10d %6.1f     |%8d%12.2f%n", (count), (count * 2.2), pounds, (pounds / 2.2));
            pounds += 5;
        }
    }
}
