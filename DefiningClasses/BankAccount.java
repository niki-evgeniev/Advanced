package DefiningClasses;

public class BankAccount {
    private static int nextId = 1;
    private int id;
    private double balance;
    private double years;
    private double interestRate = 0.02;

    public BankAccount(int id, double balance, double years) {
        this.balance = balance;
        this.years = years;
    }

    public BankAccount() {
        this.id = nextId;
        nextId++;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

}
