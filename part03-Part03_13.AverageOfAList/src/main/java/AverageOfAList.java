
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        int n = Integer.valueOf(scanner.nextLine());
        
        while(n != -1){
            nums.add(n);
            n = Integer.valueOf(scanner.nextLine());
        }
        
        int sum = 0;
        int size = nums.size();
        
        for(Integer currentNumber : nums){
            sum += currentNumber;
        }
        
        System.out.println("Average: " + sum / (size * 1.0));
        
    }
}
