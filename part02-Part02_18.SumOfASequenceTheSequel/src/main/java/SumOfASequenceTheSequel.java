
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int first = scanner.nextInt();

        System.out.println("Last number?");
        int last = scanner.nextInt();

        System.out.println("The sum is " + sumOfSequence(first, last));

    }

    private static int sumOfSequence(int floor, int n) {
        if (n == floor) {
            return floor;
        }
        return n + sumOfSequence(floor, n - 1);
    }
}
