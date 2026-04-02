import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class bank {

    TreeMap<Account, customer> customers = new TreeMap();


    /**
     * Creates a bank object and stores customers and accounts within it.
     *
     */
    public void Bank() {




        System.out.println("----------- Bank -----------");

        HashSet<customer> customers = new HashSet<customer>();
        HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
        System.out.println("Enter a number according to the options below:");
        System.out.println("1. View all Customers");
        System.out.println("2. View all Accounts");
        System.out.println("3. View a customer's details");
        System.out.println("4. View an accounts details")


        //Scanner userInput = new Scanner(System.in);
        //System.out.println("Enter a First name and Last Name: ");
       //String name = userInput.nextLine();
    }


    public showAccounts(){
        return accounts;
    }

    public showCustomers(){
        return customers;
    }
}
