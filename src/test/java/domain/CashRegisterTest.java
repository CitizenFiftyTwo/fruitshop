package domain;

import org.junit.jupiter.api.Test;

import static domain.FruitPrice.CERISE;
import static domain.FruitPrice.POMME;
import static org.assertj.core.api.Assertions.assertThat;

class CashRegisterTest {

    @Test
    public void should_return_correct_price() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.addInBasket(POMME.name());

        assertThat(cashRegister.getTotal()).isEqualTo(POMME.getPrice());
    }

    @Test
    public void should_add_total() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.addInBasket(POMME.name());
        cashRegister.addInBasket(CERISE.name());

        assertThat(cashRegister.getTotal()).isEqualTo(POMME.getPrice() + CERISE.getPrice());
    }

}
