import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Customer {

    int account_id;
    String first_name;
    String last_name;
    ArrayList<Account> customer_accounts;
    Date date_registered;




    public Customer(String name, int balance) {

    }

    public void display_accounts(){
    for (Account account : customer_accounts){
        System.out.println(account);
    }






    }
}
