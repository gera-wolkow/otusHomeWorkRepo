import objects.Account;
import objects.Bank;
import objects.Client;

import java.util.List;

/**
 * Created by iurii on 15.06.2022
 */
public class L12HomeWork {
    public static void main(String[] args) {
        Client vasia = new Client("Vasia", 25);
        Account mainAccount = new Account(123456, vasia);
        Account secondAccount = new Account(123457, vasia);

        vasia.addAccountToClient(mainAccount);
        vasia.addAccountToClient(secondAccount);

        Client petia = new Client("Petia", 27);

        Account searchAccount = new Account(123456, 0);
        Client searchClient = new Client("Petia", 27);

        Bank bank = new Bank();
        bank.addAccount(mainAccount);
        bank.addAccount(secondAccount);

        bank.addClient(vasia);
        bank.addClient(petia);

        Client client = bank.findClient(searchAccount);
        List<Account> accounts = bank.findAccounts(searchClient);

    }
}
