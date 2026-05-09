package Exercise10_6;

import Exercise10_3.MyInteger;
import Listings.StackOfIntegers;

public class App {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int count = 1; count <= 120; count++) {
            if (MyInteger.isPrime(count)) {
                stack.push(count);
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
