public class MagicSquareFactory {

  public MagicSquare createMagicSquare(int size) {
      if (size % 2 == 0) {
          throw new IllegalArgumentException("Size must be an odd number.");
      }

      MagicSquare magicSquare = new MagicSquare(size);

      int row = 0;
      int col = size / 2; // Start in the middle of the top row

      for (int num = 1; num <= size * size; num++) {
          magicSquare.placeValue(col, row, num);

          // Calculate the next position
          int nextRow = (row - 1 + size) % size; // Move up, wrap to bottom if necessary
          int nextCol = (col + 1) % size;       // Move right, wrap to left if necessary

          // If the next cell is already occupied, move down instead
          if (magicSquare.readValue(nextCol, nextRow) != 0) {
              nextRow = (row + 1) % size; // Move down
              nextCol = col;             // Stay in the same column
          }

          // Update the position
          row = nextRow;
          col = nextCol;
      }

      return magicSquare;
  }
}
