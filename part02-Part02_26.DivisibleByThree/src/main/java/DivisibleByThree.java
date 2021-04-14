
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    
    public static void divisibleByThreeInRange(int low, int high){
        while(low % 3 != 0){
            low++;
        }
        
        for(int i = low; i <= high; i+=3){
            System.out.println(i);
        }
        
  
    }
}
