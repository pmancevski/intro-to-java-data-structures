public class Exercise6_12 {
    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine){
        int min;
        int max;

        if (ch1 > ch2) {
            max = ch1;
            min = ch2;
        }
        else {
            max = ch2;
            min = ch1;
        }

        int count = 1;
        while (min <= max) {
            System.out.print((char)min + " ");
            count++;

            if (count % numberPerLine == 0) {
                System.out.println();
            }

            min++;
        }
    }
}
