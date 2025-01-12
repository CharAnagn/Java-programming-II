import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    // Add an item to the storage unit
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> items = this.storage.get(unit);
        items.add(item);
    }

    // Get the contents of a storage unit
    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    // Remove an item from a storage unit
    public void remove(String storageUnit, String item) {
        if (this.storage.containsKey(storageUnit)) {
            ArrayList<String> list = this.storage.get(storageUnit);

            list.remove(item); 

            if (list.isEmpty()) {
                this.storage.remove(storageUnit); 
            }
        }
    }

    // List all storage units that contain items
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsWithItems = new ArrayList<>();

        for (String unit : this.storage.keySet()) {
            if (!this.storage.get(unit).isEmpty()) {
                unitsWithItems.add(unit);
            }
        }

        return unitsWithItems;
    }
}
