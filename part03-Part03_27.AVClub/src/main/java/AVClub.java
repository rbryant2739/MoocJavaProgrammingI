
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] wordsAv;
        
        while(!line.equals("")){
            wordsAv = line.split(" ");
            for(String s : wordsAv){
                if(s.contains("av")){
                    System.out.println(s);
                }
            }
            line = scanner.nextLine();
        }
    }
}
