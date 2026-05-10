package Utils;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return getBalance() * getMonthlyInterestRate() / 100;
    }

    public double withdraw(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        setBalance(getBalance() - amount);

        return amount;
    }

    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        setBalance(getBalance() + amount);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
