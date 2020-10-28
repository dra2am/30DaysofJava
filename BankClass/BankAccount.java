package BankClass;

public class BankAccount {
    private int accountNum;
    private int balance;
    private String customerName;
    private String email;
    private String phone;

    // if empty constructor is called
    public BankAccount() {
        // default values
        this(007, 50, "Default Name", "Default email", "Default phone");
        System.out.println("Empty constructor called");
    }

    // only name,email,and phone needed - rest is defaulted
    public BankAccount(String customerName, String email, String phone) {
        this(007, 100, customerName, email, phone);
    }

    // constructor
    public BankAccount(int accountNum, int balance, String customerName, String email, String phone) {
        // set propeties in constructor call
        this.accountNum = accountNum;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    // getters
    public int getAccountNum() {
        return this.accountNum;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    // deposit
    public int deposit(int money) {
        this.balance += money;
        System.out.println("Deposited " + money + ". Your balance is now " + this.balance + ".");
        return 1;
    }

    // withdrawl
    public int withdraw(int money) {
        if (money > this.balance) {
            System.out.println("Insufficient funds.");
            return -1;
        }
        this.balance -= money;
        System.out.println("Withdrew " + money + ". Your balance is now " + this.balance + ".");
        return 1;
    }

}
