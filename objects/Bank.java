package objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by iurii on 15.06.2022
 */
public class Bank {

    private Map<Account, Client> data = new HashMap<>();

    private Map<Client, List<Account>> data1 = new HashMap<>();

    public void addAccount(Account account) {
        data.put(account, account.findClient());
    }

    public Client findClient(Account account) {
        return data.get(account);
    }

    public void addClient(Client client) {
        data1.put(client, client.getAccountsList());
    }

    public List<Account> findAccounts(Client client) {
        return data1.get(client);
    }
}
