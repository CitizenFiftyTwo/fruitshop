package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CashRegister {

    private List<FruitPrice> purchases = new ArrayList();

    public void addInBasket(String name) {
        purchases.add(FruitPrice.valueOf(name));
    }

    public int getTotal() {
        int numberOfCerises = Collections.frequency(purchases, FruitPrice.CERISE);
        int discount = (numberOfCerises / 2) * 20;

        int total = purchases.stream()
                .map(FruitPrice::getPrice)
                .reduce(0, Integer::sum);

        return total - discount;
    }
}
