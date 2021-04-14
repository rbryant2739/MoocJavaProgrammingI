
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int num = scanner.nextInt();
        int ctr = 0;
        int sum = 0;
        
        while(num != 0){
            ctr++;
            sum += num;
            System.out.println("Give a number:");
            num = scanner.nextInt();
        }
        
        System.out.println("Number of numbers: " + ctr);
        System.out.println("Sum of the numbers: " + sum);

    }
}
