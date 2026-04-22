public class Exercise5_27 {
    public static void main(String[] args) {

        int newLine = 0;
        int count = 0;

        for (int year = 101; year <= 2100; year++) {

            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeapYear) {
                System.out.print(year + " ");
                newLine++;
                count++;

                if (newLine % 10 == 0){
                    System.out.println();
                }
            }
        }

        System.out.println("\n\nThere are " + count + " leap year in period between 101 and 2100");
    }
}
