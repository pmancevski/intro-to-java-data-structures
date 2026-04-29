public class Exercise6_16 {
    public static void main(String[] args) {
        System.out.println("Year\t\tNumber of Days");
        for (int year = 2000; year <= 2020; year++) {
            System.out.printf("%d%17d%n", year, numberOfDaysInAYear(year));
        }
    }
    public static int numberOfDaysInAYear(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        return (isLeap) ? 366 : 365;
    }
}
