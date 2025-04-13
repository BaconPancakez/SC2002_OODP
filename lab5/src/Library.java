package lab5.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Library<T extends Searchable> {
    private List<T> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        this.items.add(item);
    }

    public void removeItem(T item) {
        this.items.remove(item);
    }

    public List<T> getAllItems() {
        return new ArrayList<>(this.items);
    }

    public Optional<T> getItemByTitle(String title) {
        return this.items.stream()
                .filter(item -> item.search(title))
                .findFirst();
    }
}
