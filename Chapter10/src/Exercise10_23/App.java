package Exercise10_23;

public class App {
    public static void main(String[] args) {
        MyString2 str = new MyString2("Hello World");

        // Test compare
        System.out.println("compare to 'Hello World': " + str.compare("Hello World"));
        System.out.println("compare to 'Hello': " + str.compare("Hello"));

        // Test substring
        MyString2 sub = str.substring(6);
        System.out.println("substring from index 6: " + sub.toChars()); // Using toChars

        // Test toUpperCase
        MyString2 upper = str.toUpperCase();
        System.out.print("toUpperCase: ");
        for (char c : upper.toChars()) {
            System.out.print(c);
        }
        System.out.println();

        // Test toChars
        System.out.print("toChars: ");
        for (char c : str.toChars()) {
            System.out.print(c);
        }
        System.out.println();

        // Test valueOf
        MyString2 boolTrue = MyString2.valueOf(true);
        MyString2 boolFalse = MyString2.valueOf(false);
        System.out.print("valueOf true: ");
        for (char c : boolTrue.toChars()) {
            System.out.print(c);
        }
        System.out.println();
        System.out.print("valueOf false: ");
        for (char c : boolFalse.toChars()) {
            System.out.print(c);
        }
        System.out.println();
    }
}
