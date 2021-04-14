import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name:");
        String name = scanner.nextLine();
        int duration;
        
        while(!name.equals("")){
            duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));
            name = scanner.nextLine();
        }
        
        System.out.println("Program's maximum duration?");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram p : programs){
            if(p.getDuration() <= maxDuration){
                System.out.println(p.getName() + ", " + p.getDuration() + " minutes");
            }
        }

    }
}
