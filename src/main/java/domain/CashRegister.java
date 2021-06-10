package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static domain.FruitType.BANANE;

public class CashRegister {

    public static final int CERISE_DISCOUNT = 20;

    private final List<FruitPrice> purchases = new ArrayList();

    public void addInBasket(String name) {
        purchases.add(FruitPrice.of(FruitType.valueOf(name)));
    }

    public int getTotal() {
        int ceriseDiscount = calculateDiscount(FruitType.CERISE, CERISE_DISCOUNT);
        int bananeDiscount = calculateDiscount(BANANE, FruitPrice.of(BANANE).getPrice());

        int total = purchases.stream()
                .map(FruitPrice::getPrice)
                .reduce(0, Integer::sum);

        return total - ceriseDiscount - bananeDiscount;
    }

    private int calculateDiscount(FruitType fruit, int discountAmount) {
        int numberOfBananes = Collections.frequency(purchases, FruitPrice.of(fruit));
        return (numberOfBananes / 2) * discountAmount;
    }
}
