import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object comparedItem) {
        if (this == comparedItem) {
            return true;
        }

        if (comparedItem == null || getClass() != comparedItem.getClass()) {
            return false;
        }

        Item other = (Item) comparedItem;

        return other.name == this.name;
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
}
