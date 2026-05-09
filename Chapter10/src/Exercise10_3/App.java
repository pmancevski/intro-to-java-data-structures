package Exercise10_3;

public class App {
    public static void main(String[] args) {
        // Test instance methods
        System.out.println("=== Testing instance methods ===");
        MyInteger num1 = new MyInteger(7);
        MyInteger num2 = new MyInteger(10);

        System.out.println("Testing getValue() with num1 (expected 7):");
        System.out.println("num1 = " + num1.getValue());

        System.out.println("\nTesting isEven() with num1 (7):");
        System.out.println("num1 is even: " + num1.isEven());

        System.out.println("\nTesting isOdd() with num1 (7):");
        System.out.println("num1 is odd: " + num1.isOdd());

        System.out.println("\nTesting isPrime() with num1 (7):");
        System.out.println("num1 is prime: " + num1.isPrime());

        System.out.println("\nTesting isEven() with num2 (10):");
        System.out.println("num2 is even: " + num2.isEven());

        System.out.println("\nTesting isOdd() with num2 (10):");
        System.out.println("num2 is odd: " + num2.isOdd());

        System.out.println("\nTesting isPrime() with num2 (10):");
        System.out.println("num2 is prime: " + num2.isPrime());

        // Test static methods with int
        System.out.println("\n=== Testing static methods with int parameters ===");
        System.out.println("Testing isEven(7):");
        System.out.println("isEven(7): " + MyInteger.isEven(7));

        System.out.println("\nTesting isOdd(7):");
        System.out.println("isOdd(7): " + MyInteger.isOdd(7));

        System.out.println("\nTesting isPrime(7):");
        System.out.println("isPrime(7): " + MyInteger.isPrime(7));

        // Test static methods with MyInteger
        System.out.println("\n=== Testing static methods with MyInteger parameters ===");
        System.out.println("Testing isEven(num1):");
        System.out.println("isEven(num1): " + MyInteger.isEven(num1));

        System.out.println("\nTesting isOdd(num2):");
        System.out.println("isOdd(num2): " + MyInteger.isOdd(num2));

        System.out.println("\nTesting isPrime(num1):");
        System.out.println("isPrime(num1): " + MyInteger.isPrime(num1));

        // Test equals methods
        System.out.println("\n=== Testing equals methods ===");
        System.out.println("Testing equals(7) with num1:");
        System.out.println("num1 equals 7: " + num1.equals(7));

        System.out.println("\nTesting equals(num2) with num1:");
        System.out.println("num1 equals num2: " + num1.equals(num2));

        // Test parseInt methods
        char[] charArray = {'1', '2', '3', '4', '5'};
        System.out.println("\n=== Testing parseInt methods ===");
        System.out.println("Testing parseInt(char[]) with [1,2,3,4,5]:");
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(charArray));

        System.out.println("\nTesting parseInt(String) with \"67890\":");
        System.out.println("parseInt(String): " + MyInteger.parseInt("67890"));
    }
}
