
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        
        String word = scanner.nextLine();
        
        while(!word.equals("end")){
            counter++;
            word = scanner.nextLine();
        }
        System.out.println(counter);
    }
}
