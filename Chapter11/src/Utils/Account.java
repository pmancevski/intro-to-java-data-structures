package Utils;

import Exercise11_8.Transaction;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions;


    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        transactions = new ArrayList<>();
        dateCreated = new Date();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.transactions = new ArrayList<>();
        this.dateCreated = new Date();
    }

    public Account(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.transactions = new ArrayList<>();
        this.dateCreated = new Date();
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return getBalance() * getMonthlyInterestRate() / 100;
    }

    public double withdraw(double amount){
        if(amount < 0){
            System.out.println("Amount cannot be <= 0");
            return -1;
        }
        transactions.add(new Transaction('W', amount, getBalance(), "Withdraw"));
        setBalance(getBalance() - amount);

        return amount;
    }

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Amount cannot be <= 0");
        }
        else {
            transactions.add(new Transaction('D', amount, getBalance(), "Deposit"));
            setBalance(getBalance() + amount);
        }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}
