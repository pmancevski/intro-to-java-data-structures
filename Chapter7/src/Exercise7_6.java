public class Exercise7_6 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50; // Number of primes to display
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 1;
        int number = 2;
        int[] primes = new int[NUMBER_OF_PRIMES];
        primes[0] = 2;

        System.out.println("The first 50 prime numbers are:\n");

        while (count < NUMBER_OF_PRIMES) {

            boolean isPrime = true;

            for (int i = 0; primes[i] <= Math.sqrt(number); i++) {
                if (number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {


                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Display the number and advance to the new line
                    System.out.println(number);
                } else
                    System.out.print(number + " ");

                primes[count] = number;
                count++;
            }

            number++;
        }

    }
}
