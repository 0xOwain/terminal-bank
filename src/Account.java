import bank;

public class Account {

    int account_id = 1;
    int balance;


    public Account(Customer customer) {
        /**
         * Creates a new blank account
         */

        balance = 0;
        account_id += 1;



    }

    /**
     * returns a new id that can be used for a new account
     */

    private getID(){
        return account_id;
    }
    public addBalance(balance){

    }
}



