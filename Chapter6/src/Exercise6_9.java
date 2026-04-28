public class Exercise6_9 {
    public static void main(String[] args) {

        System.out.printf("%7s%10s%5s%9s%9s%n%s%n", "Feet", "Meters", "|", "Meters", "Feet",
                "-------------------------------------------");

        double meters = 20.0;
        for (double feet = 1.0; feet <= 10.0; feet++) {
            System.out.printf("%6.1f%10.3f%6s%8.1f%12.3f%n", feet, footToMeter(feet), "|",
                    meters, meterToFoot(meters));

            meters += 5;
        }
    }

    public static double footToMeter(double foot){
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
