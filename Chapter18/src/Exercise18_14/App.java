package Exercise18_14;

public class App {
    public static void main(String[] args) {

        String someString = "John Doe";

        System.out.println(countUppercase(someString));
    }

    public static int countUppercase(String string) {
        if (string.isEmpty()){
            return 0;
        }
        else {
            int count = Character.isUpperCase(string.charAt(0)) ? 1 : 0;
            return count + countUppercase(string.substring(1));
        }
    }
}
