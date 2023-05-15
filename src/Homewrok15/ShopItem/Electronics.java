package Homewrok15.ShopItem;

public class Electronics implements ShopItem {
    private String name;
    private int price;

    public Electronics(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return 0;
    }

    @Override
    public Category category() {
        return null;
    }
}
