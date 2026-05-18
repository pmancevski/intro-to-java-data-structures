package Exercise18_10;

public class App {
    public static void main(String[] args) {

        String string = "(Occurrences of a specified character in a string) Write a recursive method that";
        String string_test = "Welcome";

        int occurrences = count(string_test, 'e');

        System.out.println(occurrences);
    }

    public static int count(String str, char a){
        if (str.isEmpty()) {
            return 0;
        }
        if (str.length() == 1) {
            return (str.charAt(0) == a) ? 1 : 0;
        }
        return (str.charAt(str.length() - 1) == a ? 1 : 0) + count(str.substring(0, str.length() - 1), a);
    }
}
