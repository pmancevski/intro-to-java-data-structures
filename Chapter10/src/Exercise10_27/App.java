package Exercise10_27;

public class App {
    public static void main(String[] args) {
        MyStringBuilder1 sb1 = new MyStringBuilder1("Hello");
        MyStringBuilder1 sb2 = new MyStringBuilder1(" World");

        // Test append(MyStringBuilder1)
        MyStringBuilder1 result1 = sb1.append(sb2);
        System.out.println("append(sb2): " + result1);

        // Test append(int)
        MyStringBuilder1 result2 = sb1.append(123);
        System.out.println("append(123): " + result2);

        // Test length
        System.out.println("Length: " + result2.length());

        // Test charAt
        System.out.println("charAt(1): " + result2.charAt(1));

        // Test toLowerCase
        MyStringBuilder1 lower = result2.toLowerCase();
        System.out.println("toLowerCase: " + lower);

        // Test substring
        MyStringBuilder1 sub = result2.substring(1, 4);
        System.out.println("substring(1,4): " + sub);

        // Test toString
        System.out.println("toString: " + result2.toString());
    }
}