package domain;

public enum FruitPrice {
    CERISE(75),
    POMME(100),
    BANANE(150) ;

    private final int price;

    private FruitPrice(int price) {
        this.price = price ;
    }

    public int getPrice() {
        return this.price;
    }
}
