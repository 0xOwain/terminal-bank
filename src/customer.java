import java.util.ArrayList;
import java.util.Date;

public class customer {

    int account_id;
    String first_name;
    String last_name;
    ArrayList<Account> customer_accounts;
    Date date_registered;


    public customer(String name, int balance) {

    }

    public void display_accounts(){
    for (Account account : customer_accounts){
        System.out.println(account);
    }






    }
}
