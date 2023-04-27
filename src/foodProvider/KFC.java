package foodProvider;

public class KFC implements FoodProvider{

    private int pricePerItem = 20;
    private int qunatity = 0;
    private double amountToPay = 0;

    public boolean pay(double amount) {
        if(amount > 0 && amount <= amountToPay) {
            amountToPay -= amount;
            return true;
        }
        return false;
    }


    public String deliverFood() {
        qunatity++;
        amountToPay += pricePerItem;
        return "crispy";
    }


    public int getDeliveredQuantity() {
        return 0;
    }
}
