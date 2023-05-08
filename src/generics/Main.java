package generics;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.get(0).toUpperCase();

        OldBox oldBoxWithNumber = new OldBox(12);
        OldBox oldBoxWithString = new OldBox("Mark");

        if(oldBoxWithNumber.getItem() instanceof Integer){
            System.out.println((int) oldBoxWithNumber.getItem() + 1);
        }

        Box<I> boxWithNumber = new Box<>(12);
        Box<I> boxWithString = new Box<>("Mark");

        System.out.println((int) oldBoxWithNumber.getItem() + 1);

        I stringItem = boxWithString.getItem();
        NumberBox<Long> numberBox = new NumberBox<>(10L);

        Pair<Long, Double>pair = new Pair<>(10L, 23.3);

        GlassBox<String , Double> glassBox = new GlassBox<>("test", 12.0);
        I item = glassBox.getItem();
        System.out.println(getBigger(12, 14));
    }

    public static <A extends Comparable> A  getBigger(A first, A second){
        return first.compareTo(second) > 0 ? first : second;
    }
}
