import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

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
                first.add(amount);
            } else if (command.equals("move")) {
              int currentAmount = first.contains(); // Get the amount currently in the first container
              first.remove(amount);                 // Remove the requested amount
              int moved = currentAmount - first.contains(); // Calculate how much was actually removed
              second.add(moved);  
            } else if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}
