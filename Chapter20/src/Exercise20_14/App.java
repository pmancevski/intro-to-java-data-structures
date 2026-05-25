package Exercise20_14;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        String expression = "1 2 + 3 *";

        Stack<String> stack = new Stack<>();

        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            if (!Character.isDigit(token.charAt(0))) {

                if (stack.size() < 2){
                    System.out.println("Invalid expression");
                    break;
                }

                int var1 = Integer.parseInt(stack.pop());
                int var2 = Integer.parseInt(stack.pop());

                stack.push(String.valueOf(performCalculation(var1, var2, token.charAt(0))));
            }

            if (isNumber(token)) {
                stack.push(token);
            }
        }

        System.out.println(stack.pop());
    }

    public static boolean isNumber(String number) {
        for (char c : number.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static int performCalculation(int number1, int number2, char operator) {
        int result = 0;

        switch (operator) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> result = number1 / number2;
        }

        return result;
    }
}
