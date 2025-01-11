import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scan) {
        this.todoList = list;
        this.scanner = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String userCommand = scanner.nextLine();

            if (userCommand.equals("stop")) {
                break;
            } else if (userCommand.equals("add")) {
                System.out.println("To add:");
                String todo = scanner.nextLine();
                todoList.add(todo);
            } else if (userCommand.equals("list")) {
                todoList.print();
            } else if (userCommand.equals("remove")) {
                System.out.println("Which one is removed?");
                int id = Integer.valueOf(scanner.nextLine());

                todoList.remove(id);
            }
          
        }
    }


}
