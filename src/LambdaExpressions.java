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
                return scanner.nextLine();
            } catch(FileNotFoundException e){
                throw new RuntimeException(e);
            }
        });

        tryConsumer(System.out::println);
        tryConsumer(st -> System.out.println(st.toUpperCase()));
        tryConsumer(string -> string.toLowerCase());
        tryConsumer(String::toLowerCase);

        tryPredicate(i -> i < 10);
        tryPredicate(i -> i % 2 == 0);
    }


    public static void tryConsumer(Consumer<String> consumer){
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

    public static void tryFunction(Function<Integer, Integer> incrementer) {
        int i = 4;
        System.out.println(incrementer.apply(i));
    }
}
