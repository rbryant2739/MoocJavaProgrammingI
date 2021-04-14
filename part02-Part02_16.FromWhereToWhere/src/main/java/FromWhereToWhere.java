
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int roof = scanner.nextInt();
        System.out.println("Where from?");
        int floor = scanner.nextInt();
        
        for(int i = floor; i <= roof; i++){
            System.out.println(i);
        }
        
    }
}
