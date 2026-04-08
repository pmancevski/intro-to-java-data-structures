public class Exercise1_11 {
    public static void main(String[] args) {
        System.out.println(" - One birth every 7 seconds");
        System.out.println(" - One death every 13 seconds");
        System.out.println(" - One new immigrant every 45 seconds");
        System.out.println(" -------------------------------------------");
        System.out.println(" - Current population: 312,032,486");
        System.out.println(" -------------------------------------------");
        System.out.println("Births per year: " + ((365 * 24 * 60 * 60) / 7.0));
        System.out.println("Deaths per year: " + ((365 * 24 * 60 * 60) / 13.0));
        System.out.println("New immigrants per year: " + ((365 * 24 * 60 * 60) / 45.0));
        System.out.println(" -------------------------------------------");
        System.out.println("Year #1 Population: " +
                (int)(312032486 + (((365 * 24 * 60 * 60) / 7.0) - ((365 * 24 * 60 * 60) / 13.0)
                        + ((365 * 24 * 60 * 60) / 45.0))));

        System.out.println("Year #2 Population: " +
                (int)(312032486 + (((365 * 24 * 60 * 60) / 7.0) - ((365 * 24 * 60 * 60) / 13.0)
                        + ((365 * 24 * 60 * 60) / 45.0)) + (((365 * 24 * 60 * 60) / 7.0) - ((365 * 24 * 60 * 60) / 13.0)
                        + ((365 * 24 * 60 * 60) / 45.0))));

        // should be added year 3, 4, 5
    }
}
