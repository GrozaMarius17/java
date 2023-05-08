package generics;

public class GlassBox<I,L> extends Box<I> {
    private final L lock;

    public L getLock() {
        return lock;
    }

    public GlassBox(I item, L lock) {
        super(item);
        this.lock = lock;
    }
}
