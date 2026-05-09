package Exercise9_4;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random(1000);

        for (int count = 0; count < 50; count++){
            System.out.print(random.nextInt(100) + " ");

            if ((count + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
