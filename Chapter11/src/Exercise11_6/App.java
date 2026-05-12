package Exercise11_6;

import Utils.Circle;
import Utils.Loan;

import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList();

        list.add(new Date());
        list.add(new Loan());
        list.add(new Circle());

        for (Object object : list) {
            System.out.println(object);
        }
    }
}
