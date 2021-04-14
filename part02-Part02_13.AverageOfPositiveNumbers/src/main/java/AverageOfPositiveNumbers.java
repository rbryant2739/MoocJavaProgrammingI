
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = scanner.nextInt();
        int ctr = 0;
        int sum = 0;

        while (num != 0) {

            if (num > 0) {
                ctr++;
                sum += num;
            }
            num = scanner.nextInt();
        }

        if (ctr > 0) {
            System.out.println(sum / (ctr * 1.0));
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
