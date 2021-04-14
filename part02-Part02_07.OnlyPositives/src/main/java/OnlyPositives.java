
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = scanner.nextInt();

        while (num != 0) {
            if (num > 0) {
                System.out.println(num * num);
                System.out.println("Give a number:");
                num = scanner.nextInt();
            } else {
                System.out.println("Unsuitable number");
                System.out.println("Give a number:");
                num = scanner.nextInt();
            }

        }

    }
}
