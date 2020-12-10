package fr.maif.mutation.bank;

import java.util.HashMap;
import java.util.Map;

public class BankService {
    private final Map<String, Double> accounts = new HashMap<>();

    public void open(String id, double amount) {
        accounts.put(id, amount);
    }

    public double withdraw(String id, double amount) {
        double balance = readBalanceForAccount(id);
        if(amount > balance) {
            throw new RuntimeException(
                "Insufficient balance"
            );
        }
        double newBalance = balance - amount;

        updateAccountBalance(id, newBalance);
        return newBalance;
    }

    public double balance(String id) {
        return accounts.get(id);
    }

    private void updateAccountBalance(String id, double newBalance) {
        accounts.put(id, newBalance);
    }

    private double readBalanceForAccount(String id) {
        return accounts.get(id);
    }
}
