package Exercise12_10;

public class App {
    public static void main(String[] args) {
        try {
            int[] array = new int[Integer.MAX_VALUE];
        }
        catch (OutOfMemoryError e) {
            System.out.println(e.getMessage());
        }
    }
}
