package generics;

public class NumberBox<I extends Number> {
    private final I item;

    public NumberBox(I item){
        this.item = item;

    }
    public I getItem(){
        return item;
    }
}
