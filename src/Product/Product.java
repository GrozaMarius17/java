package Product;
/* 3) create an object that represents a Product

state:

- name

- price

- quantity

- category

behavior:

- getName, getPrice, getQuantity, getCategory

- hasStock : will return true if the quantity is not 0

- isCategory(String category) : return true if the category is equal to the parameter*/
public class Product {
    private String name;
    private int price;
    private int quantity;
    private String category;

    public Product(String name, int price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        if (this.quantity == 0) {
            return false;
        } else {
            return true;
        }

    }

    public boolean isCategory(String category) {
        if (this.category == category) {
            return true;
        } else {
            return false;
        }
    }
}
