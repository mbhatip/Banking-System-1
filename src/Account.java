package mohamedasifmohammedassignment2;

/**
 *
 * @author Mohammed Mohamed Asif
 */
public abstract class Account {

    public double balance;
    private AccountType accountType;
    private int accountNumber;

    /**
     * This is the constructor for the account class
     *
     * @param balance
     * @param accountType
     * @param accountNumber
     */
    public Account(double balance, AccountType accountType, int accountNumber) {
        this.balance = balance;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }

    /**
     * This is method to get the account type
     *
     * @return
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * This is the method to set the account type
     *
     * @param accountType
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * This is the method to get the balance
     *
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * This is the method to set the balance
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * This is the method to get the account number
     *
     * @return
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * This is the method to set the account number
     *
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * This is the method to deposit money into the various accounts
     *
     * @param amount
     */
    public void deposit(double amount) {
        balance += amount;    //calculating the deposit method
    }

    /**
     * This is the method to withdraw money from the various accounts
     *
     * @param amount
     * @return
     */
    public double withdraw(double amount) {
        if (balance >= amount) {        //calculating the withdraw method
            balance = balance - amount;
        } else {
            System.out.println("You have insufficient funds!");
        }
        return amount;
    }

    /**
     * This is an abstract method that will be used in the savings and cd
     * account to calculate the interest over a certain period of time
     */
    public abstract void calculateInterest();   //Abstract class, will override in Savings and CD account

    /**
     * This toStraing method is to display the unique output
     *
     * @return
     */
    public String toString() {
        return "AccountNumber: " + accountNumber + "\n" + "Balance: $" + balance + "\n";   //Printing out desired output
    }
}
