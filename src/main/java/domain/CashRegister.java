package domain;

public class CashRegister {

    private int total = 0;

    public void addInBasket(String name) {
        total = total + FruitPrice.valueOf(name).getPrice();
    }

    public int getTotal() {
        return total;
    }
}
