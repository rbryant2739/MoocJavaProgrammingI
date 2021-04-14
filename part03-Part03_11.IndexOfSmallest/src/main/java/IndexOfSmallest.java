
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = Integer.valueOf(scanner.nextLine());
        int min = n;

        while(n != 9999){
            numbers.add(n);
            if (n < min){
                min = n;
            }
            n = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Smallest number: " + min);
        
        int size = numbers.size();
        for(int i = 0; i < size; i++){
            System.out.println("Found at index: " + i);
        }
    }
}
