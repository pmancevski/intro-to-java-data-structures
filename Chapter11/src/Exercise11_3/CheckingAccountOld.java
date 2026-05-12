package Exercise11_3;

import Utils.Account_Old;

public class CheckingAccountOld extends Account_Old {
    private double overDraftLimit;

    public CheckingAccountOld(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public double withdraw(double amount) {
        if (getBalance() + getOverDraftLimit() <= amount) {
            System.out.println("Insufficient funds.");
            return getBalance();
        }
        else {
            return super.withdraw(amount);
        }
    }
}
