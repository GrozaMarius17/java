/*5) create an object that represents a bottle:

state : - total capacity

- available liquid

- open

behavior:

- a method that returns true/false if the bottle has more liquid

- a method that returns the available liquid

- a method that returns the empty capacity

- a method that opens the bottle and returns a message ("Bottle is opened")

- a method that closes the bottle and returns a message

- a method that drinks a specific amount of liquid  and returns a message



corner cases:

- when you try to drink from a closed bottle, a message is printed out (System.out.println)

- when you try to drink and there's not enough liquid, a message is printed out

- when you try to open an opened bottle a message is printed out

- FIND MORE*/
public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public Bottle(int totalCapacity, int availableLiquid, boolean open){
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public boolean moreLiquid(){
        if(this.availableLiquid > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getAvailableLiquid(){
        return availableLiquid;
    }

    public int emptyCapacity() {
        return this.totalCapacity - this.availableLiquid;
    }

    public void openBottle() {
        if(this.open ==true) {
            System.out.println("This bottle is already open.");
        } else {
            this.open = true;
            System.out.println("I opened the bottle.");
        }
    }

    public void closeBottle() {
        if(this.open == false) {
            System.out.println("This bottle is already close.");
        } else {
            this.open = false;
            System.out.println("I closed the bottle");
        }
    }

    public void drink() {
        if(this.open == true) {
            if(this.availableLiquid >= 100) {
                this.availableLiquid -= 100;
                System.out.println("I drinked 100 ml.");
            } else {
                System.out.println("There is not enough liquid.");
            }
        } else {
            System.out.println("The bottle is closed.");
        }
    }

}
