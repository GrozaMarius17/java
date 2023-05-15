import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressions {
    public static void main(String[] args) {
        tryFunction(a -> a + 1);
        tryFunction(a -> a * 10);
        tryFunction(a -> {
            Random r = new Random();
            int randomNumber = r.nextInt(100);
            return a + randomNumber;
        });

        trySupplier(() -> "Hello");
        trySupplier(() -> {
            try {
                Scanner scanner = new Scanner((new File("")));
                return scanner.nextLine();}
            catch(FileNotFoundException e){
                throw new RuntimeException(e);
            }
        }
    }

    public static void truConsumer(Consumer<String> stringSupplier){
        String s = "test";
        consumer.accept(s);
    }

    public static void tryPredicate(Predicate<Integer> tester){
        int a = 10;
        if(tester.test(a)){
            System.out.println("won");}
        else {
            System.out.println("lost");
        }
    }

    public static void trySupplier(Supplier<String> stringSupplier){
        String s = stringSupplier.get();
        System.out.println(s);
    }

    public static void tryFunction(Function<Integer, Integer> incrementor) {
        int i = 4;
        System.out.println(incrementor.apply(i));
    }
}
