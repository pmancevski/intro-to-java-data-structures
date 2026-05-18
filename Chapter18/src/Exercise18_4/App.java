package Exercise18_4;

public class App {
    public static void main(String[] args) {

        int number = 10;

        System.out.println("Sum series for " + number + " is " + sumSeries(number));
    }

    public static double sumSeries(int number){

        if (number == 1){
            return 1;
        }
        else {
            return sumSeries(number - 1) + (1 / (double)number);
        }
    }
}
