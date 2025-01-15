
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        while (true) {
            Integer userInput = Integer.valueOf(scanner.nextLine());

            if (userInput < 0) {
                break;
            }


            inputs.add(userInput);
        }


        inputs.stream().filter(num -> num > 0 && num <=5).forEach(num -> System.out.println(num));

    }
}
