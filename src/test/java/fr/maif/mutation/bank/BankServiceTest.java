package fr.maif.mutation.bank;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class BankServiceTest {

    private BankService bankService;

    @Before
    public void setup() {

    }

@Test
public void simpleTest() {
    BankService bankService = new BankService();
    bankService.open("benjamin", 100);

    assertThat(bankService.withdraw("benjamin", 25))
            .isEqualTo(75);
}
}