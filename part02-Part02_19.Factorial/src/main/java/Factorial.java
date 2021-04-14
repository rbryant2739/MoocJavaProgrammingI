
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int n = scanner.nextInt();       
        
        System.out.println("Factorial:" + factorial(n));
    }
    private static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    
    }
}
