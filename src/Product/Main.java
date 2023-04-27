package Product;
public class Main {
    public static void main(String[] args) {
        Product iphone = new Product("11Pro", 2000, 7,"Telephone");
        Product refrigerator = new Product("Beko", 5000, 0,"Appliances");
        Product samsung = new Product("S21", 1500, 5,"Telephone");
        printProduct(iphone);
        printProduct(refrigerator);
        printProduct(samsung);


    }

    public static void printProduct(Product X) {
        String name = X.getName();
        int price = X.getPrice();
        int quantity = X.getQuantity();
        String category = X.getCategory();
        boolean stock = X.hasStock();
        boolean cat = X.isCategory("Appliances");
        System.out.println(name);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(category);
        System.out.println(stock);
        System.out.println(cat);
    }
}
