package week2.partD;
/* BankAccount Class
• Create a class `BankAccount` with:
o Fields: `accountName`, `balance`.
o Constructor: initialises both.
o Methods:
▪ `deposit(double amt)`
▪ `withdraw(double amt)` - check with `if (amt <= balance)`
before withdrawing.
▪ `displayAccount()` - print account details. */
public class BankAccount {
    String accountName;
    double balance;

    public BankAccount(String accountName, double balance){
        this.accountName = accountName;
        this.balance = balance;
    }
    public void deposit(double amt){
        balance += amt;
    }
    public void withdraw(double amt){
        if(amt <= balance){
            balance -= amt;
        } else {
            System.out.println("Sorry, not enough balance.");
        }
    }
    public void displayAccount(){
        System.out.println("Account name: " + accountName);
        System.out.println("Abalance: £" + balance);
    }
    static void main(String[] args){

        BankAccount account = new BankAccount("Michael", 1000);

        account.displayAccount();

        account.deposit(500);

        account.withdraw(400);

        account.displayAccount();
    }



}
