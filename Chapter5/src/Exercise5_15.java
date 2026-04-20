public class Exercise5_15 {
    public static void main(String[] args) {
        int newLine = 1;

        for (int count = '!'; count < (int)'~'; count++) {
            System.out.print((char)count + " ");

            if (newLine % 10 == 0){
                System.out.println();
            }

            newLine++;
        }
    }
}
