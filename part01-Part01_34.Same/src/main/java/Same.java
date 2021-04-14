
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String first = scan.nextLine().toString();
        System.out.println("Enter the second string:");
        
        if(first.equals(scan.nextLine().toString())){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
