package Exercise18_11;

public class App {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }

    public static int sumDigits(long n){
        if (n == 0){
            return 0;
        }
        else {
            return (int)((n % 10) + sumDigits(n / 10));
        }
    }
}
