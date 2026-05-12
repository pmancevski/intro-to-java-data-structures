package Exercise11_3;

import Utils.Account_Old;

public class SavingsAccountOld extends Account_Old {

    public SavingsAccountOld(int id, double balance) {
        super(id, balance);
    }

    @Override
    public double withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds!");
            return getBalance();
        }

        return super.withdraw(amount);
    }
}
