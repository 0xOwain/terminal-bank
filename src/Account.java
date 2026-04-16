import bank;

public class Account {

    int account_id;
    int balance;


    public Account(Customer customer) {
        /**
         * Creates a new blank account
         */

        balance = 0;
        // get last account id
        current_accounts = customer.showAccounts();
        if (accounts.size() == 0) {
            account_id = 1
        } else {
            accounts = customer.getAccounts();
            lastId = ;
        }



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



