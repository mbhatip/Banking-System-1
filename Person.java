/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mohamedasifmohammedassignment2;

/**
 *
 * @author Mohammed Mohamed Asif
 */
public class Person {

    private String firstName;
    private String lastName;
    private int ssn;
    private int accountNumber;

    /**
     * This is the constructor for the person class
     *
     * @param firstName
     * @param lastName
     * @param ssn
     * @param accountNumber
     */
    public Person(String firstName, String lastName, int ssn, int accountNumber) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSsn(ssn);
        this.setAccountNumber(accountNumber);
    }

    /**
     * This method gets the first name
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method gets the last name
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method gets the ssn (Social security number)
     *
     * @return
     */
    public int getSsn() {
        return ssn;
    }

    /**
     * This method gets the account number for the different account types
     *
     * @return
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * This method is to set the first name
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method is to set the last name
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method is to set the ssn (Social Security Number)
     *
     * @param ssn
     */
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    /**
     * This method is to set the account number
     *
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //Displaying output
    /**
     * This toString method is to display the unique output
     *
     * @return
     */
    public String toString() {
        return "Customer Name : " + getFirstName() + ", " + getLastName() + "\nAccount Number : " + getAccountNumber();
    }

}
