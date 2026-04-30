package Exercise6_38;

public class Exercise6_38 {
    public static void main(String[] args) {

        System.out.println("100 random characters");
        for (int count = 1; count <= 100; count++) {
            System.out.print(RandomCharacter.getRandomUpperCaseLetter() + " ");

            if (count % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n100 single digits");
        for (int count = 1; count <= 100; count++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter() + " ");

            if (count % 50 == 0) {
                System.out.println();
            }
        }
    }
}
