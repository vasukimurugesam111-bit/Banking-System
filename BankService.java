public class BankService {
     private BankAccount account;

    public void createAccount(int accNo, String name, double balance) {
        account = new BankAccount(accNo, name, balance);
        System.out.println("Account Created Successfully.");
    }

    public void deposit(double amount) {
        if (account != null)
            account.deposit(amount);
        else
            System.out.println("Create Account First.");
    }

    public void withdraw(double amount) {
        if (account != null)
            account.withdraw(amount);
        else
            System.out.println("Create Account First.");
    }

    public void checkBalance() {
        if (account != null)
            System.out.println("Current Balance : ₹" + account.getBalance());
        else
            System.out.println("Create Account First.");
    }

    public void displayAccount() {
        if (account != null)
            account.display();
        else
            System.out.println("Create Account First.");
    }
}  

