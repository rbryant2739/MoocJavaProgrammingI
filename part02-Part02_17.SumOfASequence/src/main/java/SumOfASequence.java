
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");

        int limit = scanner.nextInt();

        System.out.println("The sum is " + sumOfSequence(limit));

    }

    private static int sumOfSequence(int n) {

        if (n == 0) {
            return 0;
        } else {
            return n + sumOfSequence(n - 1);
        }
    }
}
