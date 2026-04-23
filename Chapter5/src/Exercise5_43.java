public class Exercise5_43 {
    public static void main(String[] args) {

        int countCombinations = 0;

        for (int firstDigit = 1; firstDigit <= 7; firstDigit++) {
            // (int secondDigit = 1; secondDigit <= 7; secondDigit++)
            for (int secondDigit = firstDigit + 1; secondDigit <= 7; secondDigit++) {

//                if (firstDigit == secondDigit) {
//                    continue;
//                }

                System.out.printf("%2d%2d%n",  firstDigit, secondDigit);
                countCombinations++;
            }
        }

        System.out.print("The total number of all combinations is " + countCombinations);
    }
}
