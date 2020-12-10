package fr.maif.mutation.masks;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTest {
    @Test
    public void shouldWork() {
        Customer customer = new Customer(14);
        MaskStore store = new MaskStore(1);

        // Test d'achat "normal"
        customer.buy(store, 2);
        assertThat(customer.currentStock).isEqualTo(2);
        // Dépassement du quota
        assertThat(customer.buy(store, 25)).contains(Error.QUOTA_EXCEEDED);
        assertThat(customer.buy(store, 23)).contains(Error.NOT_ENOUGH_MONEY);
        // Dépassement du prix
        assertThat(customer.buy(store, 13)).contains(Error.NOT_ENOUGH_MONEY);
    }
}
