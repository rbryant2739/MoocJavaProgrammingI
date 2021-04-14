
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] words;
        while(scanner.hasNextLine()){
           words = scanner.nextLine().split(" ");
            for(String str : words){
                System.out.println(str);
            }
        }
    }
}
