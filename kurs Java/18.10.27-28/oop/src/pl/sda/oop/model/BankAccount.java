package pl.sda.oop.model;

public class BankAccount {

    private int id;
    private int accountNumber;
    private double balance;
    private String bankName;

    public BankAccount(int id, int accountNumber, double balance, String bankName) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankName = bankName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String name){
        this.bankName = bankName;
    }
}
