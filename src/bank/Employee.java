/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Mohammed Mohamed Asif
 */
package bank;

/**
 *
 * @author Mohamed Asif
 */
public class Employee extends Person {

    /**
     * This is a constructor for the employee class. This inherits everything
     * from the Person superclass
     *
     * @param firstName
     * @param lastName
     * @param ssn
     * @param accountNumber
     */
    public Employee(String firstName, String lastName, int ssn, int accountNumber) {
        super(firstName, lastName, ssn, accountNumber);
    }
}
