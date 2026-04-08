public class Exercise1_12 {
    public static void main(String[] args) {
        System.out.println("1 hour, 40 minutes and 35 seconds is: " + (1 + ((35.0 / 60 / 60) + (40.0 / 60))) + " hours");
        System.out.println("24 miles are: " + (24 * 1.6) + "km");
        System.out.println("Average speed is: " + ((24 * 1.6) / (1 + ((35.0 / 60 / 60) + (40.0 / 60)))) + "km/h");
    }
}
