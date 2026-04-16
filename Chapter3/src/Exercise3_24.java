public class Exercise3_24 {
    public static void main(String[] args) {
        int cardNumber = (int) (Math.random() * 13) + 1;

        String cardNumberString = switch (cardNumber) {
            case 1 -> "Ace";
            case 2 -> "2";
            case 3 -> "3";
            case 4 -> "4";
            case 5 -> "5";
            case 6 -> "6";
            case 7 -> "7";
            case 8 -> "8";
            case 9 -> "9";
            case 10 -> "10";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> "";
        };

        int cardSuitNumber = (int) (Math.random() * 4);

        String cardSuitString = switch (cardSuitNumber) {
            case 0 -> "Clubs";
            case 1 -> "Hearts";
            case 2 -> "Diamonds";
            case 3 -> "Spades";
            default -> "";
        };

        System.out.println("The card you picked is " + cardSuitString + " of " + cardNumberString);
    }
}
