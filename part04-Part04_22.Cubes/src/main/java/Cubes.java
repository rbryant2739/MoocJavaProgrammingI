
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int n = 0;

        while (!word.equals("end")) {
            n = Integer.valueOf(word);
            System.out.println(n * n * n);

            word = scanner.nextLine();
        }
    }
}
