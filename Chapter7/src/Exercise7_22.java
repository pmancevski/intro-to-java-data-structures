public class Exercise7_22 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java Exercise7_22.java <String>");
            System.exit(0);
        }

        int countUppercase = 0;

        for (String element : args) {
            for (int count = 0; count < element.length(); count++) {
                if (Character.isUpperCase(element.charAt(count))) {
                    countUppercase++;
                }
            }
        }

        System.out.println("Number of uppercase characters: " + countUppercase);

    }
}
