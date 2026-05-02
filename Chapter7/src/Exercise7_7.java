public class Exercise7_7 {
    public static void main(String[] args) {
        int[] counts = new int[10];

        for (int count = 0; count < 100; count++) {
            int random = (int)(Math.random() * 10);
            counts[random]++;
        }

        System.out.println("Number\t\tOccurrences");
        for (int count = 0; count < counts.length; count++) {
            System.out.printf("%3d%15d%n", count,  counts[count]);
        }
    }
}
