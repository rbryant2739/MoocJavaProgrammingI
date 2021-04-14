
import java.util.Scanner;
import java.util.*;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<Bird>();

        System.out.println("?");

        String command = scan.nextLine();
        String name;
        String latin;
        boolean contains = false;

        while (!command.equals("Quit")) {
            if (command.equals("Add")) {
                System.out.println("Name: ");
                name = scan.nextLine();
                System.out.println("Name in Latin: ");
                latin = scan.nextLine();
                birds.add(new Bird(name, latin));
            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                name = scan.nextLine();
                contains = false;
                for (Bird b : birds) {
                    if (b.getName().equals(name)) {
                        b.observe();
                        contains = true;
                        break;
                    }
                }
                if (!contains) {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("All")) {
                for (Bird b : birds) {
                    System.out.println(b.toString());
                }
            } else if (command.equals("One")) {
                System.out.println("Bird?");
                name = scan.nextLine();
                for (Bird b : birds) {
                    if (b.getName().equals(name)) {
                        System.out.println(b.toString());
                        break;
                    }
                }
            }
            System.out.println("?");
            command = scan.nextLine();
        }

    }

}
