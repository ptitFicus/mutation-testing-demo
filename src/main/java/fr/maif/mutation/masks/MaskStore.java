package fr.maif.mutation.masks;

public class MaskStore {
    public final int price;
    public int balance = 0;

    public MaskStore(int price) {
        this.price = price;
    }

    public int buy(int quantity) {
        int cost = cost(quantity);
        balance += cost;
        return cost;
    }

    public int cost(int quantity) {
        if(quantity >= 10) {
            return (quantity - 1) * price;
        }
        return quantity * price;
    }
}
