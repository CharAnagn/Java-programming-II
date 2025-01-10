import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LiquidContainer first = new LiquidContainer();
        LiquidContainer second = new LiquidContainer();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.addAmount(amount);
            } else if (command.equals("move")) {
                int moved = first.moveAmount(amount);
                second.addAmount(moved);
            } else if (command.equals("remove")) {
                second.removeAmount(amount);
            }
        }
    }
}
