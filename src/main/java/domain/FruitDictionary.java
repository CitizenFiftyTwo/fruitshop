package domain;

import static domain.FruitPrice.BANANE;
import static domain.FruitPrice.CERISE;
import static domain.FruitPrice.POMME;

public enum FruitDictionary {
    CERISES(CERISE),
    BANANES(BANANE),
    MELE(POMME),
    POMMES(POMME),
    APPLES(POMME);

    private final FruitPrice fruitPrice;

    FruitDictionary(FruitPrice fruitPrice) {
        this.fruitPrice = fruitPrice ;
    }

    public FruitPrice getFruitPrice() {
        return this.fruitPrice;
    }
}
