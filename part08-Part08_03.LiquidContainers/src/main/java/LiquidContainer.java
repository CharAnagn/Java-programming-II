public class LiquidContainer {
  private int amount;

  public LiquidContainer() {
      this.amount = 0; // Initial amount is 0
  }

  public void addAmount(int amount) {
      if (amount > 0) {
          this.amount += amount;
          if (this.amount > 100) {
              this.amount = 100; // Cap at 100 liters
          }
      }
  }

  public int moveAmount(int amount) {
      if (amount < 0) {
          return 0;
      }

      if (amount > this.amount) {
          int allThatCanBeMoved = this.amount;
          this.amount = 0; // Empty the container
          return allThatCanBeMoved;
      }

      this.amount -= amount;
      return amount;
  }

  public void removeAmount(int amount) {
      if (amount > 0) {
          this.amount -= amount;
          if (this.amount < 0) {
              this.amount = 0; // Ensure no negative amount
          }
      }
  }

  public int getAmount() {
      return this.amount;
  }

  @Override
  public String toString() {
      return this.amount + "/100";
  }
}
