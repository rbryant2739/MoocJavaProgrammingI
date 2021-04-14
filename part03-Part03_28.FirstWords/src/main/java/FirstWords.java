
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line = scanner.nextLine();
        String[] words;
        while(!line.equals("")){
            words = line.split(" ");
            System.out.println(words[0]);
            line = scanner.nextLine();
        }
    }
}
