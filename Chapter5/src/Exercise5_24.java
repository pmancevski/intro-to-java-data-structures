public class Exercise5_24 {
    public static void main(String[] args) {
        double num = 1;
        double num1 = 3;
        double sum = 0;

        while (num1 <= 99){
            sum += num / num1;

            num += 2;
            num1 += 2;
        }

        System.out.println("The sum with while loop: " + sum);
    }
}
