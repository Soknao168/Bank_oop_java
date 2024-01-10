public class BankAccount {
    private final String user;
    private final String phoneNumeber;
    private double balance;

    public BankAccount(String user, String phoneNumeber, double balance) {
        this.user = user;
        this.phoneNumeber = phoneNumeber;
        this.balance = balance;
    }

    public void depositFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Updated balance: $" + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdrawFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds for withdrawal.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + phoneNumeber);
        System.out.println("Account Holder: " + user);
        System.out.println("Balance: $" + balance);
    }
}
