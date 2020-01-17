package mohamedasifmohammedassignment2;

/**
 *
 * @author Mohammed Mohamed Asif
 */
public class Customer extends Person {

    static private int seqId = 1000;
    private int customerId;

    /**
     * This is a constructor for the customer class. This inherits everything
     * from the Person superclass
     *
     * @param firstName
     * @param lastName
     * @param ssn
     * @param accountNumber
     */
    public Customer(String firstName, String lastName, int ssn, int accountNumber) {
        super(firstName, lastName, ssn, accountNumber);
        this.customerId = seqId;
    }

    /**
     * This is a method to get the customer id
     *
     * @return
     */
    public int getCustomerId() {
        seqId++;
        return customerId;
    }

    /**
     * This is a method to set the customer id
     *
     * @param customerId
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    //Displaying output
    /**
     * This toString displays the unique output
     *
     * @return
     */
    public String toString() {
        return "Customer Name : " + getFirstName() + ", " + getLastName() + "\nCustomer ID : " + getCustomerId() + "\nAccount Number : " + getAccountNumber();
    }
}
