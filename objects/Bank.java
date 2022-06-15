package objects;

import java.util.ArrayList;

/**
 * Created by iurii on 15.06.2022
 */
public class Bank {
    private ArrayList<Account> accounts;

    public void addAccount(Account account) {
        accounts.add(account);
    }

//    public Client findClient(Account account) {
//        return accounts
//    }
}
