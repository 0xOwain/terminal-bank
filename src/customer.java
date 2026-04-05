import java.util.ArrayList;
import java.util.Date;

/**
 * Customer class is vital for storing accounts.
 */
public class Customer {

    int customerId;
    String firstName;
    String lastName;
    String postcode;
    TreeSet<Accounts> accounts;
    Date dateRegistered;

    /**
     * Creates a new blank customer
     *
     *
     */
    public Customer() {
        this.firstName = "John"
        this.lastName = "Doe";
        this.postcode = "Null";
        this.dateRegistered = new Date();
        TreeSet<Accounts> accounts = new TreeSet<Accounts>();

    }

    /**
     * Creates a customer with a given first name, last name and a postcode
     * If any parameters are unknown - type N/A - they can be changed later
     *
     *
     */
    public Customer(String firstName, String lastName, String postcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postcode = postcode;
        this.dateRegistered = new Date();
        TreeSet<Accounts> accounts = new TreeSet<Accounts>();
    }



    public showAccounts() {
        return accounts;
    }


    public removeAccount() {

    }
}
