import java.util.ArrayList;
import java.util.Date;

/**
 * Customer class is vital for storing accounts.
 */
public class Customer {

    int customerId;
    String firstName; // customer first name
    String lastName; // customer last name
    String postcode; // customer postcode
    Date dateCreated; // date customer was created

    /**
     * Creates a new blank customer with default values
     *
     *
     */
    public Customer() {
        this.customerId =
        this.firstName = "John"
        this.lastName = "Doe";
        this.postcode = "Null";
        this.dateCreated = new Date();

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

    }



    public getAccounts() {
        return accounts;
    }


    public removeAccount() {

    }
}
