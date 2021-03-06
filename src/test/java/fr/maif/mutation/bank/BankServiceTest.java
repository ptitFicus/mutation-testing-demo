package fr.maif.mutation.bank;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


public class BankServiceTest {

    private BankService bankService;

    @Before
    public void setup() {
        bankService = new BankService();
        bankService.open("benjamin", 100);
    }

    @Test
    public void simpleTest() {
        assertThat(bankService.withdraw("benjamin", 25))
                .isEqualTo(75);
    }

    @Test
    public void overdrawTest() {
    }

    @Test
    public void limitTest() {
    }
}