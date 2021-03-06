package domain;

import org.junit.jupiter.api.Test;

import static domain.CashRegister.CERISE_DISCOUNT;
import static domain.FruitType.BANANE;
import static domain.FruitType.CERISE;
import static domain.FruitType.POMME;
import static org.assertj.core.api.Assertions.assertThat;

class CashRegisterTest {

    @Test
    public void should_return_correct_price() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.addInBasket(POMME.name());

        assertThat(cashRegister.getTotal()).isEqualTo(FruitPrice.of(POMME).getPrice());
    }

    @Test
    public void should_add_total() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.addInBasket(POMME.name());
        cashRegister.addInBasket(CERISE.name());

        assertThat(cashRegister.getTotal()).isEqualTo(FruitPrice.of(CERISE).getPrice() + FruitPrice.of(POMME).getPrice());
    }

    @Test
    public void should_make_discount_when_two_cerises() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.addInBasket(CERISE.name());
        cashRegister.addInBasket(CERISE.name());

        assertThat(cashRegister.getTotal()).isEqualTo(FruitPrice.of(CERISE).getPrice() * 2 - CERISE_DISCOUNT);
    }

    @Test
    public void should_more_discount_when_four_cerises() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.addInBasket(CERISE.name());
        cashRegister.addInBasket(CERISE.name());
        cashRegister.addInBasket(CERISE.name());
        cashRegister.addInBasket(CERISE.name());

        assertThat(cashRegister.getTotal()).isEqualTo(FruitPrice.of(CERISE).getPrice() * 4 - CERISE_DISCOUNT * 2);
    }

    @Test
    public void one_banane_bought_one_free() {
        CashRegister cashRegister = new CashRegister();

        cashRegister.addInBasket(BANANE.name());
        cashRegister.addInBasket(BANANE.name());

        assertThat(cashRegister.getTotal()).isEqualTo(FruitPrice.of(BANANE).getPrice());
    }
}
