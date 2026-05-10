package Exercise10_8;

public class Tax {
    public final static int SINGLE_FILER = 0;
    public final static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public final static int MARRIED_SEPARATELY = 2;
    public final static int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax(){

    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {

        double tax = 0;
        double remaining = getTaxableIncome();

        for (int count = brackets[getFilingStatus()].length - 1; count >= 0; count--) {

            double bracketLimit;

            if (count == 0) {
                bracketLimit = brackets[getFilingStatus()][0];
            } else {
                bracketLimit = brackets[getFilingStatus()][count] - brackets[getFilingStatus()][count-1];
            }

            if (remaining > bracketLimit) {
                tax += bracketLimit * rates[count];
                remaining -= bracketLimit;
            } else {
                tax += remaining * rates[count];
                break;
            }
        }

        if (remaining > 0) {
            tax += remaining * rates[rates.length - 1];
        }

        return tax;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
}
