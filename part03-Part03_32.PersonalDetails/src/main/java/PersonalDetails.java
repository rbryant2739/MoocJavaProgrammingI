
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLen = -1;
        String longName = "";
        int ctr = 0;
        int sum = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            int len = parts[0].length();
            if (len > maxLen) {
                maxLen = len;
                longName = parts[0];
            }
            ctr++;
            sum += Integer.valueOf(parts[1]);
        }
        if (ctr > 0) {
            System.out.println("Longest name: " + longName);
            System.out.println("Average of the birth years: " + sum / (ctr * 1.0));
        }

    }
}
