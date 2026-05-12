package Exercise11_8;

import Utils.Account;

import java.util.Date;

public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        date = new Date();
        setType(type);
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        if (type == 'W' || type == 'D') {
            this.type = type;
        }
        else {
            System.out.println("Invalid type");
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getDate() + " | " + getType() + " | $" + getAmount() + " | Balance: $" + getBalance() + " | " + getDescription();
    }
}
