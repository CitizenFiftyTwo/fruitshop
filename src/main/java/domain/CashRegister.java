package domain;

public class CashRegister {

    public int addInBasket(String name) {
        return FruitPrice.valueOf(name).getPrice();
    }
}
