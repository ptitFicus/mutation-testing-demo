package fr.maif.mutation;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        Customer customer = new Customer(14);
        MaskStore store = new MaskStore(1);

        // Test d'achat "normal"
        customer.buy(store, 2);
        // Dépassement du quota
        customer.buy(store, 25);
        // Dépassement du prix
        customer.buy(store, 13);
    }
}
