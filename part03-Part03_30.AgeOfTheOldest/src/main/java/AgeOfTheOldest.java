
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = -1;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            int age = Integer.valueOf(parts[1]);
            if (age > maxAge) {
                maxAge = age;
            }
        }
        if (maxAge > -1) {
            System.out.println("Age of the oldest: " + maxAge);
        }
    }
}
