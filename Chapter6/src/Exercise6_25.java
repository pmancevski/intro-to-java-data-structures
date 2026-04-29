public class Exercise6_25 {
    public static void main(String[] args) {
        System.out.println(convertMillis(5500));
    }

    public static String convertMillis(long millis) {
        long seconds = (millis / 1000) % 60;
        long minutes = (millis / (60 * 1000)) % 60;

        // there are extra brackets because it could be added %24 --> (millis / (60 * 60 * 1000) % 24
        long hours = (millis / (60 * 60 * 1000));

        return hours + ":" + minutes + ":" + seconds;
    }
}
