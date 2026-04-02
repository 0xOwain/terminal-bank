import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class bank {

    TreeMap<Account, customer> customers = new TreeMap();

    public void Bank() {

        System.out.println("----------- Welcome to DoeBank -----------");

        ArrayList<customer> customers = new ArrayList<customer>();
        HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();


        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a First name and Last Name: ");
        String name = userInput.nextLine();
    }
}
