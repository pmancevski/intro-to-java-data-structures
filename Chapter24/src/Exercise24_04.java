public class Exercise24_04 {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();

        int count = 0;
        int numberToCheck = 2;

        while (count < 50) {

            if (isPrime(numberToCheck)) {
                stack.push(numberToCheck);
                count++;
            }

            numberToCheck++;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
