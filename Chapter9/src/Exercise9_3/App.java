package Exercise9_3;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date date = new Date();

        for (long count = 10000; count <= 100000000000L; count *= 10){
            date.setTime(count);
            System.out.println("Long var: " + count + "\t\tDate: " + date.toString());
        }
    }
}
