public class Exercise5_40 {
    public static void main(String[] args) {
        int headOccurrences = 0;
        int tailOccurrences = 0;

        for (int count = 0; count < 10000000; count++) {
            // 0 for head, 1 for tail
            int coinSide = (int)(Math.random() * 2);

            if (coinSide == 0) {
                headOccurrences++;
            }
            else {
                tailOccurrences++;
            }
        }

        System.out.printf("Number of head occurrences: %d%nNumber of tail occurrences: %d%n",
                headOccurrences, tailOccurrences);
    }
}
