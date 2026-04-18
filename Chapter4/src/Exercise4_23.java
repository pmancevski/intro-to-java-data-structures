import java.util.Locale;
import java.util.Scanner;

public class Exercise4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Enter employee’s name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double grossPay = hours * rate;
        double federalTaxPercent = federalTax * 100.0;
        double stateTaxPercent = stateTax * 100.0;
        double federalWithhold = grossPay * federalTaxPercent / 100;
        double stateWithhold = grossPay *  stateTaxPercent / 100;
        double totalDeduction = federalWithhold + stateWithhold;
        double netPay = grossPay -  totalDeduction;

        System.out.printf("%n%nEmployee Name: %s%nHours Worked: %.1f%nPay Rate: $%.2f%nGross Pay: $%.2f%n" +
                "Deductions:%n\tFederal Withholding (%.1f%%): $%.2f%n\tState Withholding (%.1f%%): $%.2f%n\t" +
                        "Total Deduction: $%.2f%n\tNet Pay: $%.2f%n",
                name, hours, rate, grossPay, federalTaxPercent, federalWithhold, stateTaxPercent, stateWithhold,
                totalDeduction, netPay);
    }
}
