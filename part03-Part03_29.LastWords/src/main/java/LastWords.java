
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line = scanner.nextLine();
        String[] words;
        while(!line.equals("")){
            words = line.split(" ");
            System.out.println(words[words.length - 1]);
            line = scanner.nextLine();
        }

    }
}
