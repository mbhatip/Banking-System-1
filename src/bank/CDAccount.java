package bank;

/**
 *
 * @author Mohammed Mohamed Asif
 */
public class CDAccount extends Account {

    private double interestRate;
    private int timePeriod;

    /**
     * This is the constructor for the CDAccount
     *
     * @param duration
     * @param accountType
     * @param balance
     * @param accountNumber
     */
    public CDAccount(int duration, AccountType accountType, double balance, int accountNumber) {
        super(balance, accountType, accountNumber);
        this.timePeriod = duration;
    }

    /**
     * This is the overrided calcualteInterest method that is used to calculate
     * the interest for the CDAccount class
     *
     */
    @Override
    public void calculateInterest() {
        if (timePeriod <= 1) {     //override method to define a set intrest for each year
            interestRate = 0.3;
        } else if (timePeriod <= 2) {
            interestRate = 0.45;
        } else if (timePeriod <= 3) {
            interestRate = 0.95;
        } else if (timePeriod <= 4) {
            interestRate = 1.5;
        } else if (timePeriod <= 5) {
            interestRate = 1.8;
        }
        this.balance += balance * (interestRate) / 100;   //Calculating balance 
    }

    /**
     * This is the toString method that is used to display a unique output
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "CDAccount [interestRate=" + interestRate + "]";  //Displaying output
    }

}
