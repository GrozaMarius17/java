package Recursivity;

public class InfiniteLoopMain {
    private static long counter = 0;
    public static void main(String[] args) {
        infiniteLoop();
    }

    public static void infiniteLoop() {
        if(counter == 1000) {
            return;
        }
        System.out.println(counter++);
        infiniteLoop();
    }
}
