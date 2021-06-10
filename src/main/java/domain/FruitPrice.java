package domain;

public enum FruitPrice {
    POMME(100),
    CERISE(150),
    BANANE(250) ;

    private final int price;

    private FruitPrice(int price) {
        this.price = price ;
    }

    public int getPrice() {
        return this.price;
    }
}
