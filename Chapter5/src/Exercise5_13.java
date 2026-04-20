public class Exercise5_13 {
    public static void main(String[] args) {

        int count = 0;

        while (Math.pow(count, 3) < 12000){
            count++;
        }

        System.out.println("Largest n number that N^3 < 12000 is " + (count - 1));
    }
}
