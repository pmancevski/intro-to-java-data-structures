package Exercise10_28;

public class App {
    public static void main(String[] args) {
        // Test default constructor
        MyStringBuilder2 sb1 = new MyStringBuilder2();
        System.out.println("Default: " + sb1); // Need toString() override? If not, use getter

        // Test char[] constructor
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        MyStringBuilder2 sb2 = new MyStringBuilder2(chars);
        System.out.println("Char array: " + sb2);

        // Test String constructor
        MyStringBuilder2 sb3 = new MyStringBuilder2("World");
        System.out.println("String: " + sb3);

        // Test insert
        MyStringBuilder2 sb4 = new MyStringBuilder2("HelloWorld");
        MyStringBuilder2 toInsert = new MyStringBuilder2("123");
        MyStringBuilder2 inserted = sb4.insert(5, toInsert);
        System.out.println("Insert at 5: " + inserted);

        // Test reverse
        MyStringBuilder2 original = new MyStringBuilder2("abcdef");
        MyStringBuilder2 reversed = original.reverse();
        System.out.println("Reversed: " + reversed);

        // Test substring
        MyStringBuilder2 sub = original.substring(2);
        System.out.println("Substring from 2: " + sub);

        // Test toUpperCase
        MyStringBuilder2 upper = original.toUpperCase();
        System.out.println("Uppercase: " + upper);
    }
}
