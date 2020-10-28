package BankClass;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(001, 100, "email@email.com", "Jane
        Smith", "555-5555");
        //test default
        // BankAccount myAccount = new BankAccount();

        // test getters
        System.out.println(myAccount.getAccountNum());
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getEmail());
        System.out.println(myAccount.getName());
        System.out.println(myAccount.getPhone());
        // test methods
        myAccount.deposit(200);
        myAccount.withdraw(100);
    }
}
