package Exercise18_6;

public class App {
    public static void main(String[] args) {

        int number = 10;

        System.out.println("Sum series for " + number + " is " + sumSeries(number));
    }

    public static double sumSeries(int number){
        if (number == 1){
            return number / (double)(number + 1);
        }
        else {
            return sumSeries(number - 1) + number / (double)(number + 1);
        }
    }
}
