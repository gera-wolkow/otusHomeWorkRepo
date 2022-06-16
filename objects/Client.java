package objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by iurii on 15.06.2022
 */
public class Client {
    private String name;
    private int age;

    private List<Account> accountsList = new ArrayList<>();

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Account> getAccountsList() {
        return accountsList;
    }

    public void addAccountToClient(Account account) {
        accountsList.add(account);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && name.equals(client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
