
import java.util.*;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary wordSet;

    public TextUI(Scanner scanner, SimpleDictionary wordSet) {
        this.scanner = scanner;
        this.wordSet = wordSet;
    }

    public void start() {

        while (true) {

            System.out.println("Command:");
            String command = scanner.nextLine();
            String word = null;
            String translation = null;

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word:");
                word = scanner.nextLine();
                System.out.println("Translation:");
                translation = scanner.nextLine();

                wordSet.add(word, translation);

            } else if (command.equals("search")) {
                System.out.println("To be translated:");
                word = scanner.nextLine();

                if (wordSet.translate(word) == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + wordSet.translate(word));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
