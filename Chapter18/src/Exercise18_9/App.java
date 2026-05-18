package Exercise18_9;

public class App {
    public static void main(String[] args) {

        String string = "abcd";

        reverseDisplay(string);
    }

    public static void reverseDisplay(String value){

        if (value.length() == 1){
            System.out.print(value.charAt(0));
        }
        else {
            System.out.print(value.charAt(value.length() - 1));

            reverseDisplay(value.substring(0, value.length()-1));
        }
    }
}
