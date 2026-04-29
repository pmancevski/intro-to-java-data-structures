public class Exercise5_39 {
    public static void main(String[] args) {
        double baseSalary = 5000;
        double sales = 1;
        double commission = 0;

        // Assume that sales are 1$
        while (commission < (30000 - baseSalary)) {
            if (sales <= 5000) {
                commission = sales * 0.08;
            }
            else if (sales <= 10000) {
                commission = 5000 * 0.08 + (sales - 5000) * 0.10;
            }
            else {
                commission = 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;
            }

            sales += 1;
        }

        System.out.println("Minimum number of sales is " + sales + "$");
    }
}
