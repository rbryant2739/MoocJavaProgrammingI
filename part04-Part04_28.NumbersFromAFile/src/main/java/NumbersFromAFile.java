
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int count = 0;
        int n;
        
        try (Scanner nReader = new Scanner(Paths.get(file))){
            while(nReader.hasNextLine()){
                n = Integer.valueOf(nReader.nextLine());
                if(n <= upperBound && n >= lowerBound){
                    count++;
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Numbers: " + count);
        
    }

}
