package objects;

import java.util.Objects;

/**
 * Created by iurii on 15.06.2022
 */
public class Account {
    private int accountNumber;
    private Client accountHolder;
    private int moneyAmount;

    public Account (int accountNumber, Client accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.moneyAmount = 0;
    }

    public Account(int accountNumber, int moneyAmount) {
        this.accountNumber = accountNumber;
        this.moneyAmount = moneyAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber && moneyAmount == account.moneyAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, moneyAmount);
    }

    public Client findClient () {
        return this.accountHolder;
    }
}
