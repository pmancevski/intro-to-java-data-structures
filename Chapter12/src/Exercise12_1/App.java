package Exercise12_1;

public class App {
    public static void main(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException("Usage: java Calculator operand1 operator operand2");
        }

        // The result of the operation
        int result = 0;

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                try {
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                }
                catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid operand: " + args[0] + " or " + args[2]);
                }
                break;
            case '−':
                try {
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                }
                catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid operand: " + args[0] + " or " + args[2]);
                }
                break;
            case '.':
                try {
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                }
                catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid operand: " + args[0] + " or " + args[2]);
                }
                break;
            case '/':
                try {
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                }
                catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid operand: " + args[0] + " or " + args[2]);
                }
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
