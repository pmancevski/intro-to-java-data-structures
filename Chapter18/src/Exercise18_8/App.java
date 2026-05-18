package Exercise18_8;

public class App {
    public static void main(String[] args) {
        int value = 12345;

        reverseDisplay(value);
    }

    public static void reverseDisplay(int value){
        if (value / 10 == 0){
            System.out.println(value % 10);
        }
        else {
            System.out.print((value % 10));
            reverseDisplay(value / 10);
        }

    }
}
