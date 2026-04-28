public class Exercise6_10 {
    public static void main(String[] args) {

        int displayNumber = 1;

        for (int count = 2; count <= 10000; count++) {
            if (isPrime(count)){
                System.out.print(count + " ");

                if (displayNumber % 15 == 0){
                    System.out.println();
                }

                displayNumber++;
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
