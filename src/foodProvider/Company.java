package foodProvider;
public class Company {

    private FoodProvider foodSource;

    private int numberOfEmployees;

    public void setFoodSource(FoodProvider foodSource){
        this.foodSource = foodSource;
    }


    public void sendFoodToEmployees(){
        for(int i=0;i<numberOfEmployees; i++) {
            foodSource.deliverFood();
        }
    }

    public void makePayment() {
        foodSource.pay( 100);
    }
}