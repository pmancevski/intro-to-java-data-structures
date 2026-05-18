package Exercise18_5;

public class App {
    public static void main(String[] args) {

        int number = 10;

        System.out.println("Sum series for " + number + " is " + sumSeries(number));
    }

    public static double sumSeries(int number){

        if (number == 1){
            return (number / (double)(2 * number + 1));
        }
        else {
            return sumSeries(number - 1) + (number / (double)(2 * number + 1));
        }
    }
}
