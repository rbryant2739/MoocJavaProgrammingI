
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics sumTotal = new Statistics();
        Statistics sumEven = new Statistics();
        Statistics sumOdd = new Statistics();
        
        System.out.println("Enter numbers:");
        int n = Integer.valueOf(scanner.nextLine());
        
        while(n != -1){
        
            if(n%2 == 0){
                sumEven.addNumber(n);
            } else {
                sumOdd.addNumber(n);
            }
            sumTotal.addNumber(n);
            n = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Sum: " + sumTotal.sum());
        System.out.println("Sum of even numbers: " + sumEven.sum());
        System.out.println("Sum of odd numbers: " + sumOdd.sum());
    }
}
