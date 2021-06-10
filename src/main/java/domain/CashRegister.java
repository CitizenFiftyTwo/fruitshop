package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CashRegister {

    public static final int CERISE_DISCOUNT = 20;

    private final List<FruitPrice> purchases = new ArrayList();

    public void addInBasket(String name) {
        purchases.add(FruitPrice.valueOf(name));
    }

    public int getTotal() {
        int ceriseDiscount = calculateDiscount(FruitPrice.CERISE, CERISE_DISCOUNT);
        int bananeDiscount = calculateDiscount(FruitPrice.BANANE, FruitPrice.BANANE.getPrice());

        int total = purchases.stream()
                .map(FruitPrice::getPrice)
                .reduce(0, Integer::sum);

        return total - ceriseDiscount - bananeDiscount;
    }

    private int calculateDiscount(FruitPrice fruit, int discountAmount) {
        int numberOfBananes = Collections.frequency(purchases, fruit);
        return (numberOfBananes / 2) * discountAmount;
    }
}
