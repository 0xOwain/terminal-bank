import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {

    Customer customer;
    Account account;

    public void Bank() {

        System.out.println("----------- Welcome to DoeBank -----------");

        ArrayList<Customer> customers = new ArrayList<Customer>();
        HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();


        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a First name and Last Name: ");
        String name = userInput.nextLine();
    }
}
