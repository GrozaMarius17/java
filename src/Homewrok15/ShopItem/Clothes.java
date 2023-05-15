package Homewrok15.ShopItem;

public class Clothes implements ShopItem {
    private String name;
    private int price;
    private Category category;

    public Clothes(String name, int price, Category category0){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return category;
    }
}
