
import java.util.*;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        String command;

        while (true) {

            command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                list.add(scanner.nextLine());
            } else if (command.equals("list")) {
                list.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                list.remove(Integer.valueOf(scanner.nextLine()));
            } else {
                System.out.println("Unknown command");
            }

        }

    }
}
