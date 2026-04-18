public class Exercise4_25 {
    public static void main(String[] args) {
        char letter1 = (char)(65 + Math.random() * 26);
        char letter2 = (char)(65 + Math.random() * 26);
        char letter3 = (char)(65 + Math.random() * 26);

        int random = (int)(1000 + Math.random() * 9000);

        String plateNumber = letter1 + "" + letter2 + "" + letter3 + " " + random;

        System.out.println("Your plate number is: " + plateNumber);
    }
}
