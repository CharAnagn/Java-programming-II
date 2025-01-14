import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Warehouse {
    private Map<String, Integer> prices; // Map to store product prices
    private Map<String, Integer> stock; // Map to store product stocks

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price); // Add product and its price to the prices map
        this.stock.put(product, stock); // Add product and its stock to the stock map
    }

    public int price(String product) {
        // Check if the product exists in the prices map
        return this.prices.getOrDefault(product, -99);
    }


    public int stock(String product) {
        return this.stock.getOrDefault(product, 0);

    }


    public boolean take(String product) {
      // Check if the product exists and has stock
      if (this.stock.getOrDefault(product, 0) > 0) {
          this.stock.put(product, this.stock.get(product) - 1); // Reduce stock by 1
          return true;
      }
      return false;
  }


    public Set<String> products() {
      return this.stock.keySet();
    }

  }
