import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class bank {

    HashSet<Customer> customers = new HashSet<Customer>();
    TreeSet<Account> accounts = new TreeSet<Account>();

    /**
     * Creates a bank object and stores customers and accounts within it.
     *
     */
    public void Bank() {




        System.out.println("----------- Bank -----------");

        //customers hold accounts.
        HashSet<Customer> customers = new HashSet<customer>();
        HashSet<Account> accounts = new HashSet<Account>();
        System.out.println("Enter a number according to the options below:");
        System.out.println("1. View all Customers");
        System.out.println("2. View a customer's details");
        System.out.println("3. New Transaction");
        System.out.println9("4. New Customer");
        Scanner userInput = new Scanner(System.in);
       //String name = userInput.nextLine();
    }


    public showAccounts(){
        return accounts;
    }

    public showCustomers(){
        return customers;
    }

    public lastAccount() {

    }


    public newCustomer(){

    }

    public newAccount(Customer customer){

    }
}
