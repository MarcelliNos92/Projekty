package pl.sda.oop.model;

public class User {

    private String name;
    private String lastname;
    private int age;
    private BankAccount bankAccount;
    private Car car;

    public User(String name, String lastname, int age, BankAccount bank, Car car) { //konstruktor - taka sama nazwa jak klasa
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.bankAccount = bank;
        this.car = car;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getBankAccountAccountNumber(){
        return bankAccount.getAccountNumber();
    }


    public String getBankAccountBankName(){
        return bankAccount.getBankName();
    }

    public double getBankAccountBalance(){
        return  bankAccount.getBalance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

