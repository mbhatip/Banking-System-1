package mohamedasifmohammedassignment2;

/**
 *
 * @author Mohammed Mohamed Asif
 */
public class CheckingAccount extends Account {

    /**
     * This is the constructor for the checking account class
     *
     * @param accountType
     * @param balance
     * @param accountNumber
     */
    public CheckingAccount(AccountType accountType, double balance, int accountNumber) {
        super(balance, accountType, accountNumber);
    }

    /**
     * This is the override method, that is empty for the checking account
     * because the checking account does not use the method calculateIntrest
     */
    @Override
    public void calculateInterest() {  //empty bc we are not calculating intrest in checking account
    }
}
