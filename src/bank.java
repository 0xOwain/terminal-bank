import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.io

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

        Scanner sc = new Scanner(System.in); //get user choice
        System.out.println("Enter an option in accordance with the number:");
        System.out.println("1. View all Customers\n" +
                "2. View Customer /n" +
                        "3. View Recent Transactions");
        String userInput = sc.nextLine();
        if (userInput.equals("1")){

        }
        else if (userInput.equals("2")){

        }
        else if (userInput.equals("3")){

        }
        else if (userInput.equals("4")){

        }
        else{
            throw new IllegalArgumentException("Invalid option.")
        }

    }




    private showAccounts(){
        if (accounts.size() == 0){
            return System.out.println("Accounts is empty");
        }
        else {
            for (Account account : accounts){
                System.out.println(account);
            }
        }
    }

    private showCustomers(){
        if (customers.size() == 0){
            return System.out.println("Customers is empty");
        }

    }

    private showCustomerAccounts(){

    }

    private lastAccount() {
        if (customers.size() == 0){
            return System.out.println("Customers is empty");
        }
        return accounts.last();
    }


    private.getID(Account custAccount){
        account.

    }

    private newCustomer(){

    }

    private newAccount(Customer customer){

    }
}
