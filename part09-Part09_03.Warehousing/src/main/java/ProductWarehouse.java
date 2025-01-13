import java.util.ArrayList;

public class ProductWarehouse extends Warehouse {
    private String productName; // Only product name is stored here


    public ProductWarehouse(String productName, double capacity) {
        super(capacity); // Initialize capacity in the superclass
        this.productName = productName;
    // Initial balance starts at 0.0
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount); // Add to warehouse balance

    }

    @Override
    public double takeFromWarehouse(double amount) {
        double takenAmount = super.takeFromWarehouse(amount); // Remove from warehouse balance
       // Track the new balance
        return takenAmount;
    }

    @Override
    public String toString() {
        return getName() + ": " + super.toString();
    }
}
