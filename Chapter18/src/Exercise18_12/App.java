package Exercise18_12;

public class App {
    public static void main(String[] args) {
        String string = "abcd";

        reverseDisplay(string,3);
    }

    public static void reverseDisplay(String value, int high){

        if (high == 0){
            System.out.print(value.charAt(0));
        }
        else {
            System.out.print(value.charAt(high));

            reverseDisplay(value, high - 1);
        }
    }
}
