package Exercise12_1;

public class App1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException("Usage: java Calculator operand1 operator operand2");
        }

        // The result of the operation
        int result = 0;

        if (!isDigit(args[0])) {
            System.out.println("Wrong input: " + args[0]);
            System.exit(1);
        }
        else if (!isDigit(args[2])) {
            System.out.println("Wrong input: " + args[2]);
            System.exit(1);
        }

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '−':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);

                break;
            case '.':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':

                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);


        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }

    public static boolean isDigit(String number) {
        boolean isDigit = true;

        for (int count = 0; count < number.length(); count++) {
            if (!Character.isDigit(number.charAt(count))) {
                isDigit = false;
            }
        }

        return isDigit;
    }
}
