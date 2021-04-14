
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int num = scanner.nextInt();
        int sum = 0;
        
        while(num != 0){
            sum += num;
            System.out.println("Give a number:");
            num = scanner.nextInt();
        }
        
        System.out.println("Sum of the numbers: " + sum);

    }
}
