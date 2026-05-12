package Exercise11_12;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

    }

    public static double sum(ArrayList<Double> list){
        double sum = 0;

        for (Double number : list){
            sum += number;
        }

        return sum;
    }
}
