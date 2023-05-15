package Homewrok15.ShopItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Shop<T extends ShopItem> {
    private List<T> items;

    public Shop(){
        items = new ArrayList<>();
    }
    public void addItem(T item) {
        items.add(item);
    }

    public List<T> findByCategory(Category cat) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.category() == cat) {
                result.add(item);
            }
        }
        return result;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.price() <= maxPrice) {
                result.add(item);
            }
        }
        return result;
    }

    public Optional<T> findByName(String name) {
        for (T item : items) {
            if (item.name().equals(name)) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    public Optional<T> removeItem(String name) {
        Iterator<T> iterator = items.iterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (item.name().equals(name)) {
                iterator.remove();
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }
}
