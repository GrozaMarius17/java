public class Main {
    public static void main(String[] args) {
        Bottle cola = new Bottle(500, 300, false);

        boolean liquid = cola.moreLiquid();
        System.out.println(liquid);

        int available = cola.getAvailableLiquid();
        System.out.println(available);

        int empty = cola.emptyCapacity();
        System.out.println(empty);

        cola.openBottle();

        cola.drink();

        cola.closeBottle();
    }
}