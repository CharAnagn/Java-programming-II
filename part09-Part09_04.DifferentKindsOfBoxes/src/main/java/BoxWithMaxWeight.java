import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxCapacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxCapacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        // Check if adding the item exceeds the max capacity
    if (this.maxCapacity >= item.getWeight()) {
      this.maxCapacity -= item.getWeight();

      items.add(item);
    }
    }

    @Override
    public boolean isInBox(Item item) {
        // Check if the item is in the box
        return items.contains(item);
    }
}
