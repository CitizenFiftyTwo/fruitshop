package domain;


import static domain.FruitType.BANANE;
import static domain.FruitType.CERISE;
import static domain.FruitType.POMME;

public enum FruitDictionary {
    CERISES(CERISE),
    BANANES(BANANE),
    MELE(POMME),
    POMMES(POMME),
    APPLES(POMME);

    private final FruitType fruitType;

    FruitDictionary(FruitType fruitType) {
        this.fruitType = fruitType;
    }

    public FruitType getFruitType() {
        return this.fruitType;
    }
}
