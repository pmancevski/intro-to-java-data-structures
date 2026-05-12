package Exercise10_26;

public class App {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println( "Usage: java Calculator <expression>");
            System.exit(1);
        }

        String expression = args[0];

        // Remove all spaces
        expression = expression.replaceAll("\\s+", "");

        if (!Character.isDigit(expression.charAt(0))) {
            System.out.println("Wrong expression");
            System.exit(1);
        }

        String[] tokens = expressionToArray(expression);

        int num1 = Integer.parseInt(tokens[0]);
        int num2 = Integer.parseInt(tokens[2]);
        char operator = tokens[1].charAt(0);

        int result = 0;
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            default: System.out.println("Invalid operator"); System.exit(1);
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

    }

    public static String[] expressionToArray(String expression) {
        String[] array = new String[3];
        int arrayIndex = 0;
        String number = "";
        String operator = "";

        for (int count =0; count < expression.length(); count++) {

            if (Character.isDigit(expression.charAt(count))) {
                number += expression.charAt(count);
            }
            else {
                if (isItOperator(expression.charAt(count))) {
                    array[arrayIndex++] = number;
                    operator = String.valueOf(expression.charAt(count));
                    array[arrayIndex+1] = operator;
                    arrayIndex++;
                }
            }
        }

        array[arrayIndex] = number;

        return array;
    }

    public static boolean isItOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }
}
