package mohamedasifmohammedassignment2;

/**
 * @author Mohammed Mohamed Asif
 */
import java.util.Scanner;

public class Start {

    private static Scanner inputA, inputB;

    /**
     * This is the main method that runs the whole program
     *
     * @param args
     */
    public static void main(String[] args) {
        inputA = new Scanner(System.in);
        inputB = new Scanner(System.in);
        String choice1, choice2;
        Bank bank = new Bank();
        // loop the utility in loop until the user makes the choice to exit
        while (true) {
            // Print the options for the user to choose from
            System.out.println("Personal Banking System Menu \n");
            System.out.println("Press Y to enter Employee options: ");
            choice1 = inputA.nextLine();
            if (choice1.equalsIgnoreCase("Y")) {
                while (true) {
                    //Different options for the user
                    System.out.println(" 1. Create a checking account");
                    System.out.println(" 2. Create a savings account");
                    System.out.println(" 3. Create a CD account");
                    System.out.println(" 4. Deposit Money");
                    System.out.println(" 5. Withdraw Money");
                    System.out.println(" 6. Display Balance");
                    System.out.println(" 7. Search Customer");
                    System.out.println(" 8. Close Account");
                    // Prompt the use to make a choice
                    System.out.println("Enter your choice (Q to quit): ");
                    // Capture the user input in scanner object and store it in a pre declared
                    // variable
                    choice2 = inputB.nextLine();
                    // Check the user input
                    switch (choice2.toUpperCase()) {
                        //Create Checking Account
                        case "1":

                            Scanner input1 = new Scanner(System.in);
                            System.out.print("Enter your First Name : ");
                            String firstName1 = input1.nextLine();
                            System.out.print("Enter your Last Name : ");
                            String lastName1 = input1.nextLine();
                            System.out.print("Enter your SSN: ");
                            int ssn1 = input1.nextInt();
                            bank.createCheckingAccount(firstName1, lastName1, ssn1);
                            break;

                        // Create Savings Account
                        case "2":

                            Scanner input2 = new Scanner(System.in);
                            System.out.print("Enter your First Name : ");
                            String firstName2 = input2.nextLine();
                            System.out.print("Enter your Last Name : ");
                            String lastName2 = input2.nextLine();
                            System.out.print("Enter your SSN: ");
                            int ssn2 = input2.nextInt();
                            System.out.print("Enter Interest rate: ");
                            double interest = input2.nextDouble();
                            bank.createSavingsAccount(firstName2, lastName2, ssn2, interest);
                            break;

                        // Create CD Account
                        case "3":

                            Scanner input3 = new Scanner(System.in);
                            System.out.print("Enter your First Name : ");
                            String firstName3 = input3.nextLine();
                            System.out.print("Enter your Last Name : ");
                            String lastName3 = input3.nextLine();
                            System.out.print("Enter your SSN: ");
                            int ssn3 = input3.nextInt();
                            System.out.print("Enter Time Period in years(1/2/3/4/5) : ");
                            int timeperiod = input3.nextInt();
                            bank.createCDAccount(firstName3, lastName3, ssn3, timeperiod);
                            break;

                        // Deposit Money
                        case "4":

                            Scanner input4 = new Scanner(System.in);
                            System.out.print("Enter your Account Number : ");
                            int acctNum = input4.nextInt();
                            System.out.print("Enter the amount to deposit : ");
                            double amount = input4.nextDouble();
                            System.out.print("Enter your Account Type as CHECKING/SAVINGS/CD : ");
                            AccountType acctType = AccountType.valueOf(input4.next().toUpperCase());
                            bank.depositAmount(acctNum, amount, acctType);
                            break;

                        // Withdraw Money
                        case "5":

                            Scanner input5 = new Scanner(System.in);
                            System.out.print("Enter your Account Number : ");
                            int acctNum5 = input5.nextInt();
                            System.out.print("Enter the amount to Withdraw : ");
                            double amount5 = input5.nextDouble();
                            System.out.print("Enter your Account Type as CHECKING/SAVINGS/CD : ");
                            AccountType acctType5 = AccountType.valueOf(input5.next().toUpperCase());
                            bank.withdrawAmount(acctNum5, amount5, acctType5);
                            break;

                        // Display Balance
                        case "6":

                            Scanner input6 = new Scanner(System.in);
                            System.out.print("Enter your Account Number : ");
                            int acctNum6 = input6.nextInt();
                            bank.displayBalance(acctNum6);
                            break;

                        // Search Customer
                        case "7":

                            Scanner input7 = new Scanner(System.in);
                            System.out.print("Enter your Account Number : ");
                            int acctNum7 = input7.nextInt();
                            bank.searchCustomer(acctNum7);
                            break;

                        // Remove Customer
                        case "8":

                            Scanner input8 = new Scanner(System.in);
                            System.out.print("Enter your Account Number : ");
                            int acctNum8 = input8.nextInt();
                            bank.removeCustomer(acctNum8);
                            break;

                        case "Q":
                            // exit from the program
                            System.out.println("Good Bye...");
                            System.exit(0);
                        default:
                            // inform user in case of invalid choice.
                            System.out.println("Invalid choice. Read the options carefully...");
                            continue;
                    }
                }
            }
        }
    }
}
