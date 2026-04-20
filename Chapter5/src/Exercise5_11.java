public class Exercise5_11 {
    public static void main(String[] args) {
        int newLine = 0;

        for (int count = 100; count <= 200; count++) {

            if (count % 5 == 0 && count % 6 != 0){
                System.out.print(count + " ");
                newLine++;
            }

            if (count % 6 == 0 && count % 5 != 0){
                System.out.print(count + " ");
                newLine++;
            }

            if (newLine % 10 == 0 && newLine != 0){
                System.out.println();
                newLine = 0;
            }
        }
    }
}
