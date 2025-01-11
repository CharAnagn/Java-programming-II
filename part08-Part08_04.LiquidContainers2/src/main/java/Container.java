public class Container {
  private int capacity;

  public Container() {
      this.capacity = 0;
  }

  public int contains() {
      return capacity;
  }

  public void add(int amount) {
      if (amount > 0) {
          capacity += amount;
      }

      if (capacity > 100) {
          capacity = 100;
      }
  }

  public void remove(int amount) {
      if (amount > 0) {
          capacity -= amount;
          
      }

      if (capacity < 0) {
          capacity = 0;
      }


  }

  public String toString() {
      return capacity + "/" + "100";
  }
}
