
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = -1;
        String oldest = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            int age = Integer.valueOf(parts[1]);
            if (age > maxAge) {
                maxAge = age;
                oldest = parts[0];
            }
        }
        if (maxAge > -1) {
            System.out.println("Name of the oldest: " + oldest);
        }

    }
}
