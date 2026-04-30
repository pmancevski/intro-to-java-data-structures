public class Exercise6_32 {
    public static void main(String[] args) {

        int countWinningGames = 0;

        for (int count = 0; count < 10000; count++) {

            System.out.println("-------- New round --------");
            int sumOfDice = rollDice();

            if (isLose(sumOfDice)) {
                System.out.println("You lose!");
            } else if (isWin(sumOfDice)) {
                System.out.println("You win!");
                countWinningGames++;
            } else {
                int point = isPoint(sumOfDice);
                boolean flag = true;

                do {
                    sumOfDice = rollDice();

                    if (sumOfDice == 7) {
                        System.out.println("You lose!");
                        flag = false;
                    } else if (sumOfDice == point) {
                        System.out.println("You win!");
                        countWinningGames++;
                        flag = false;
                    } else {
                        System.out.println("Point is " + point);
                    }
                }
                while (flag);
            }
            System.out.println();
        }

        System.out.println("Final score. You won: "  + countWinningGames + " times");
    }

    public static boolean isWin(int number) {
        return number == 7 || number == 11;
    }

    public static boolean isLose(int number) {
        return number == 2 || number == 3 || number == 12;
    }

    public static int isPoint(int number) {
        System.out.println("Point is " + number);

        return (number == 4 || number == 5 || number == 6 || number == 8 || number == 9 || number == 10) ? number : -1;
    }

    public static int rollDice() {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;

        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));

        return dice1 + dice2;
    }
}
