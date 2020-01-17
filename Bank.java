package mohamedasifmohammedassignment2;

/**
 * @author Mohammed Mohamed Asif
 */
//5 major methods are:
//depositAmount: This methods deposits money in various amounts in each of the accounts
//withdrawAmount: This methods withdraws money from various amounts in each of the accounts
//removeCustomer: This method removes the customer and their account from their respecting array list 
//createSavingsAccount: This methods creates a savings account and performs all its functions for the customer
//createCheckingAccount: This methods creates a cd account and performs all its functions for the customer
import java.util.ArrayList;
import java.util.Iterator;

public class Bank {

//Array List used in the project 
    ArrayList<Account> accounts = new ArrayList<Account>();
    ArrayList<Person> customers = new ArrayList<Person>();

    /**
     * This method is used to create a checking account, it is controlled by the
     * employee to help sit it up for a customer
     *
     * @param firstName
     * @param lastName
     * @param ssn
     */
    public void createCheckingAccount(String firstName, String lastName, int ssn) {
        int accountNumber = (int) ((Math.random() * 500000) + 1000);   //Assigning a account number
        Person customer = addCustomer(firstName, lastName, ssn, accountNumber); //Adding customer to person array list
        CheckingAccount account = new CheckingAccount(AccountType.CHECKING, 0.0, accountNumber);
        accounts.add(account);
        System.out.println("\n***Checking Account Created Successfully***");
        System.out.println("\nYour Account Details\n");
        System.out.println("**************************");
        System.out.println(customer.toString());            //Printing out all the outputs
        System.out.println("\n\n");
    }

    //Add Customer
    /**
     * This purpose of this method is to add customers to the bank, that is
     * later called by other methods
     *
     *
     * @param firstName
     * @param lastName
     * @param ssn
     * @param accountNumber
     * @return
     */
    public Person addCustomer(String firstName, String lastName, int ssn, int accountNumber) {
        Person customer = new Customer(firstName, lastName, ssn, accountNumber); //Creating an add customer method
        customers.add(customer);
        return customer;
    }

    // CreateSavingsAccount Method
    /**
     * This method is used to create a savings account
     *
     * @param firstName
     * @param lastName
     * @param ssn
     * @param interest
     */
    public void createSavingsAccount(String firstName, String lastName, int ssn, double interest) {
        int accountNumber = (int) ((Math.random() * 50000000) + 1000);  //Assigning a account number
        Person customer = addCustomer(firstName, lastName, ssn, accountNumber);  //Adding customer to person array list
        SavingsAccount account = new SavingsAccount(interest, AccountType.SAVINGS, 0.0, accountNumber);
        accounts.add(account);
        System.out.println("\n***Savings Account Created Successfully***");
        System.out.println("\nYour Account Details\n");
        System.out.println("**************************");
        System.out.println(customer.toString());     //Printing out all the outputs
        System.out.println("\n\n");
    }

    // CreateCDAccount Method
    /**
     * This method is used to create a cd account
     *
     * @param firstName
     * @param lastName
     * @param ssn
     * @param duration
     */
    public void createCDAccount(String firstName, String lastName, int ssn, int duration) {
        int accountNumber = (int) ((Math.random() * 50000000) + 1000);  //Assigning a account number
        Person customer = addCustomer(firstName, lastName, ssn, accountNumber);  //Adding customer to person array list
        CDAccount cdAccount = new CDAccount(duration, AccountType.CD, 0.0, accountNumber);
        accounts.add(cdAccount);
        System.out.println("\n***CD Account Created Successfully***");
        System.out.println("\nYour Account Details\n");
        System.out.println("**************************");
        System.out.println(customer.toString());    //Printing out all the outputs
        System.out.println("\n\n");
    }

    // Search Customer Method
    /**
     * This method is used to sort and search for a customer in the person array
     * list
     *
     * @param acctNum
     */
    public void searchCustomer(int acctNum) {
        for (int i = 0; i < customers.size(); i++) {    //looping through the array list to find customer
            if (customers.get(i).getAccountNumber() == acctNum) {  //if get account # = the account # typed
                System.out.println("\nCustomer Details\n");
                System.out.println("**************************");
                System.out.println(customers.get(i).toString());  //Printing out the output
                System.out.println("\n\n");
                break;
            } else {
                System.out.println("\nCustomer details not available\n");
            }
        }
    }

    // Remove Customer and account Method
    /**
     * This method is to remove the customer and their account from the bank
     * program
     *
     * @param acctNum
     */
    public void removeCustomer(int acctNum) {
        Iterator<Person> itr1 = customers.iterator();//assign an iterator to the list
        while (itr1.hasNext()) {
            Person customer = itr1.next();
            if (customer.getAccountNumber() == acctNum) {  //Matching the customer with the account
                Iterator<Account> itr = accounts.iterator();
                while (itr.hasNext()) {
                    Account account = itr.next();
                    if (account.getAccountNumber() == acctNum) {  //Making sure the account # match up
                        itr.remove();   //Removing the account
                        break;
                    } else {
                        System.out.println("\nAccount details not available for this Customer\n");
                    }
                }
                itr1.remove();
                System.out.println("\nCustomer removed Successfully\n");
                break;
            } else {
                System.out.println("\nCustomer details not available\n");  //print statements to check if customer and account was removed 
            }
        }
    }

    // Search Accounts Method
    /**
     * This method is used to sort through and search for a particular account
     * in the account array list.
     *
     * @param acctNum
     * @return
     */
    public Account searchAccount(int acctNum) {
        Account account = null;
        for (int i = 0; i < accounts.size(); i++) {         //Looping throught the account array list 
            if (accounts.get(i).getAccountNumber() == acctNum) {   //Finding a mathch based on account #
                account = accounts.get(i);
                break;
            }
        }
        return account;
    }

    /**
     * This method is to deposit money into the customers various accounts
     *
     * @param acctNum
     * @param amount
     * @param acctType
     */
    public void depositAmount(int acctNum, double amount, AccountType acctType) {
        Account account = searchAccount(acctNum);
        if (account == null) {
            System.out.println("\nAccount details not available\n");
        } else {
            switch (acctType) {          //Looking at the deposit function for each of the different cases
                case CHECKING:
                    ((CheckingAccount) account).deposit(amount);
                    break;
                case SAVINGS:
                    ((SavingsAccount) account).calculateInterest();  //calculating intrest 
                    ((SavingsAccount) account).deposit(amount);
                    break;
                case CD:
                    ((CDAccount) account).calculateInterest();  //calculating intrest
                    ((CDAccount) account).deposit(amount);
                    break;
                default:
                    // inform user in case of invalid choice.
                    System.out.println("Invalid Account Type");
            }
            System.out.println("\nAccount Details\n");
            System.out.println("**************************");
            System.out.println(account.toString());   //Printing outputs
            System.out.println("\n\n");
        }
    }

    /**
     * This method is to withdraw money from the customers various accounts
     *
     * @param acctNum
     * @param amount
     * @param acctType
     */
    public void withdrawAmount(int acctNum, double amount, AccountType acctType) {
        Account account = searchAccount(acctNum);
        if (account == null) {
            System.out.println("\nAccount details not available\n");
        } else {
            switch (acctType) {          //Looking at the deposit function for each of the different cases
                case CHECKING:
                    ((CheckingAccount) account).withdraw(amount);
                    break;
                case SAVINGS:
                    ((SavingsAccount) account).calculateInterest();  //calculating intrest
                    ((SavingsAccount) account).withdraw(amount);
                    break;
                case CD:
                    ((CDAccount) account).calculateInterest();  //calculating intrest
                    ((CDAccount) account).withdraw(amount);
                    break;
                default:
                    // inform user in case of invalid choice.
                    System.out.println("Invalid Account Type");
            }
            System.out.println("\nAccount Details\n");
            System.out.println("**************************");
            System.out.println(account.toString());
            System.out.println("\n\n");
        }
    }

    /**
     * This is the method to display the balance of each of the customers
     * accounts
     *
     * @param acctNum
     */
    public void displayBalance(int acctNum) {
        Account account = searchAccount(acctNum);
        if (account == null) {
            System.out.println("\nAccount details not available\n");
        } else {
            System.out.println("\nAccount Details\n");
            System.out.println("**************************");
            System.out.println(account.toString());    //Displaying the balance 
            System.out.println("\n\n");
        }
    }
}
