public class OneItemBox extends Box {
  private Item item; // Stores the single item in the box

  public OneItemBox() {
      this.item = null; // Initially, the box is empty
  }

  @Override
  public void add(Item item) {
      // Add the item only if the box is empty
      if (this.item == null) {
          this.item = item;
      }
  }

  @Override
  public boolean isInBox(Item item) {
      // Check if the item matches the one in the box
      return this.item != null && this.item.equals(item);
  }
}
