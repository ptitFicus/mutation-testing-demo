package fr.maif.mutation;

import java.util.Optional;

public class Customer {
    private final static int maxQuota = 25;
    public int money;
    public int currentStock = 0;

    public Customer(int money) {
        this.money = money;
    }

    public Optional<Error> buy(MaskStore maskStore, int count) {
        int cost = maskStore.cost(count);

        if(currentStock + count > maxQuota) {
            return Optional.of(Error.QUOTA_EXCEEDED);
        }
        else if(cost >= money) {
            return Optional.of(Error.NOT_ENOUGH_MONEY);
        }

        maskStore.buy(count);
        currentStock += count;
        money -= cost;
        return Optional.empty();
    }
}
