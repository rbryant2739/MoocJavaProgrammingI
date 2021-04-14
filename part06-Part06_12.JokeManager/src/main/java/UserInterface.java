
import java.util.*;

public class UserInterface {

    private JokeManager joker;
    private Scanner scanner;

    public UserInterface(JokeManager joker, Scanner scanner) {
        this.joker = joker;
        this.scanner = scanner;
    }

    public void start() {

        String command;

        while (true) {
            System.out.println("Commands: \n1 - add a joke\n2 - draw a joke");
            System.out.println("3 - list jokes\nX - stop");

            command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                this.joker.addJoke(scanner.nextLine());
            } else if (command.equals("2")) {
                System.out.println(this.joker.drawJoke());
            } else if (command.equals("3")) {
                this.joker.printJokes();
            }
        }
    }

}
