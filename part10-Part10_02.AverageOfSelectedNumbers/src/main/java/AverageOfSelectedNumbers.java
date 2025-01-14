import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs = new ArrayList<>();
      

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("end")) {
                break;
            }

            inputs.add(userInput);
        }


        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String negativeOrPositive = scanner.nextLine();

        if (negativeOrPositive.equals("n")) {

          double averageNegative = inputs.stream()
          .mapToInt(s -> Integer.valueOf(s))
          .filter(number -> number < 0)
          .average().orElse(Double.NaN);

          System.out.println("Average of the negative numbers: " + averageNegative);

       } else if (negativeOrPositive.equals("p")) {
        double averagePositive = inputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(number -> number > 0)
        .average().orElse(Double.NaN);

        System.out.println("Average of the positive numbers: " + averagePositive);

       }
        
    }
}
