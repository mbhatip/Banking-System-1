package bank;

/**
 *
 * @author Mohammed Mohamed Asif
 */
public class SavingsAccount extends Account {

    private double interestRate;

    /**
     * This is the constructor for the SavingsAccount class
     *
     * @param rate
     * @param accountType
     * @param balance
     * @param accountNumber
     */
    public SavingsAccount(double rate, AccountType accountType, double balance, int accountNumber) {
        super(balance, accountType, accountNumber);
        this.interestRate = rate;
    }

    /**
     * This is the method to get the interest rate
     *
     * @return
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * This is the method to set the interest rate
     *
     * @param interestRate
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * This is the overridden method to calculate interest rate for the savings
     * account
     *
     *
     */
    @Override
    public void calculateInterest() {
        this.balance += balance * (interestRate / 12) / 100;   //override method to calculate intrest
    }

    /**
     * This is a toString method which displays the unique output
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "SavingsAccount [interestRate=" + interestRate + "]";  //Display output
    }
}
