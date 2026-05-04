public class Exercise7_21 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java Exercise7_21.java num1 num2 num3 ...");
            System.exit(0);
        }

        int sum = 0;

        for (String element : args) {
            sum += Integer.parseInt(element);
        }

        System.out.println("Sum: " + sum);

        printArray(args);
    }

    public static void printArray(String[] array){
        for (String element : array) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
