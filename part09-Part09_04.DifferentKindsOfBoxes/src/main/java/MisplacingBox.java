import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> items; // Keeps track of added items

    public MisplacingBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        // Add the item to the list (but it will always be "misplaced")
        items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        // Always return false, regardless of what was added
        return false;
    }
}
