package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CashRegister {

    public static final int CERISE_DISCOUNT = 30;

    private final List<FruitPrice> purchases = new ArrayList();

    public void addInBasket(String name) {
        purchases.add(FruitPrice.valueOf(name));
    }

    public int getTotal() {
        int numberOfCerises = Collections.frequency(purchases, FruitPrice.CERISE);
        int ceriseDiscount = (numberOfCerises / 2) * CERISE_DISCOUNT;

        int numberOfBananes = Collections.frequency(purchases, FruitPrice.BANANE);
        int bananeDiscount = (numberOfBananes / 2) * FruitPrice.BANANE.getPrice();

        int total = purchases.stream()
                .map(FruitPrice::getPrice)
                .reduce(0, Integer::sum);

        return total - ceriseDiscount - bananeDiscount;
    }
}
