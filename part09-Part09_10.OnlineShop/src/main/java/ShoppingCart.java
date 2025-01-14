import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart; // Map to store items

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        // If the product is already in the cart, increase its quantity
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            // Otherwise, add a new item to the cart
            cart.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int totalPrice = 0;
        // Calculate the total price by summing up the prices of all items
        for (Item item : cart.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }


    public void print() {
      for (Item item : cart.values()) {
        System.out.println(item.getProduct() + ": " + item.getQty());
      }
    }
}
