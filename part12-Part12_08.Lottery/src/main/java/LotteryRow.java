
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
       
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        this.random = new Random();

        while (this.numbers.size() < 7) {
          int randomNumber = random.nextInt(40) + 1; // Range 1–40
          if (!containsNumber(randomNumber)) {
              this.numbers.add(randomNumber);
          }
      }
      
        
    }

    public boolean containsNumber(int number) {
        
        return numbers.contains(number);
    }
}

