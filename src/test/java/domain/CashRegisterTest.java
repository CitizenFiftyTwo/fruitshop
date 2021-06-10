package domain;

import org.junit.jupiter.api.Test;

import static domain.FruitPrice.POMME;
import static org.assertj.core.api.Assertions.assertThat;

class CashRegisterTest {

    @Test
    public void should_return_correct_price() {
        CashRegister cashRegister = new CashRegister();

        int total = cashRegister.addInBasket(POMME.name());

        assertThat(total).isEqualTo(POMME.getPrice());
    }

}
