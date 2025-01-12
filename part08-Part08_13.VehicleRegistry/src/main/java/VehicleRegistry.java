import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    // Adds a license plate and owner to the registry
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!registry.containsKey(licensePlate)) {
            registry.put(licensePlate, owner);
            return true;
        }
        return false; // License plate already has an owner
    }

    // Retrieves the owner of the car corresponding to the license plate
    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate); // Returns null if not found
    }

    // Removes the license plate and its owner from the registry
    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        return false; // License plate not in the registry
    }

    // Prints all license plates in the registry
    public void printLicensePlates() {
        for (LicensePlate licensePlate : registry.keySet()) {
            System.out.println(licensePlate);
        }
    }

    // Prints unique owners in the registry
    public void printOwners() {
        HashSet<String> uniqueOwners = new HashSet<>();
        for (String owner : registry.values()) {
            if (!uniqueOwners.contains(owner)) {
                System.out.println(owner);
                uniqueOwners.add(owner); // Avoid duplicate prints
            }
        }
    }
}
