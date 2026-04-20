public class Exercise5_12 {
    public static void main(String[] args) {

        int count = 0;

        while (Math.pow(count, 2) < 12000){
            count++;
        }

        System.out.println("Smallest n number that N^2 > 12000 is " + count);
    }
}
