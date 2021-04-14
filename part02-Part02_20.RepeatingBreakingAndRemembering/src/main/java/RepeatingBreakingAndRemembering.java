
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int cnt = 0;
        int nEven = 0;
        int nOdd = 0;
        int sum = 0;
        int n = Integer.valueOf(scanner.nextLine());

        while (n != -1) {
            cnt++;
            sum += n;
            if (n % 2 == 0) {
                nEven++;
            } else {
                nOdd++;
            }
            n = Integer.valueOf(scanner.nextLine());
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + cnt);
        System.out.println("Average: " + sum / (cnt * 1.0));
        System.out.println("Even: " + nEven);
        System.out.println("Odd: " + nOdd);

    }
}
