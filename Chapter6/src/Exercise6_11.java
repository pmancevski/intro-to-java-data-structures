public class Exercise6_11 {
    public static void main(String[] args) {

        System.out.printf("%15s%17s%n", "Sales Amount", "Commission");

        for (int count = 10000; count <= 100000; count+= 5000){
            System.out.printf("%11d%20.1f%n", count, computeCommission(count));
        }
    }

    public static double computeCommission(double salesAmount) {
        if (salesAmount <= 5000) {
            return salesAmount * 0.08;
        }
        else if (salesAmount <= 10000) {
            return 400 + (salesAmount - 5000) * 0.10;
        }
        else {
            return 900 + (salesAmount - 10000) * 0.12;
        }
    }
}
