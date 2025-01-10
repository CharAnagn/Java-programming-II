
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            Integer userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            }

            if (userInput > 0) {
                sum += userInput;
                count++;
            }
        }

        if (sum > 0) {
            System.out.println(1.0 * sum / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }

}
