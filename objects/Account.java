package objects;

/**
 * Created by iurii on 15.06.2022
 */
public class Account {
    private int accountNumber;
    private Client accountHolder;
    private int moneyAmount;

    public void Account (int accountNumber, Client accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.moneyAmount = 0;
    }

    public Client findClient (Account account) {
        return account.accountHolder;
    }
}
