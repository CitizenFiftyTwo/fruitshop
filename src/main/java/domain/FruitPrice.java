package domain;

import java.util.Arrays;

public enum FruitPrice {
    CERISE_PRICE(FruitType.CERISE, 75),
    POMME_PRICE(FruitType.POMME, 100),
    BANANE_PRICE(FruitType.BANANE, 150);

    private final FruitType fruitType;
    private final int price;

    FruitPrice(FruitType fruitType, int price) {
        this.fruitType = fruitType;
        this.price = price;
    }

    public static FruitPrice of(FruitType fruitType) {
        return Arrays.stream(values()).filter(fruitPrice -> fruitPrice.fruitType.equals(fruitType)).findAny()
                .orElse(null);
    }

    public int getPrice() {
        return this.price;
    }
}
