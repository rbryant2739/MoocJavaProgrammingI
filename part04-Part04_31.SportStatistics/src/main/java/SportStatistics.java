
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Game> games = new ArrayList<>();
        
        try( Scanner scanner = new Scanner(Paths.get(file)) ){
            String[] parts;
            String t1;
            String t2;
            int s1;
            int s2;
            
            while(scanner.hasNextLine()){
                parts = scanner.nextLine().split(",");
                t1 = parts[0];
                t2 = parts[1];
                s1 = Integer.valueOf(parts[2]);
                s2 = Integer.valueOf(parts[3]);
                
                games.add(new Game(t1, t2, s1, s2));
            }
                
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int matches = 0;
        int wins = 0;
        int losses = 0;
        
        for(Game g : games){
            if(g.hasTeam(team)){
                matches++;
                if(g.winner().equals(team)){
                    wins++;
                } else {
                    losses++;
                }
            }
        }
        System.out.println("Games: " + matches);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
