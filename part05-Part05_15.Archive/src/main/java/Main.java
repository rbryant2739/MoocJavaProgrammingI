
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        
        System.out.println("Identifier? (empty will stop)");
        
        String id;
        String name;
                   
        while(true) {
       
            id = scanner.nextLine();
            if(id.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            Person p = new Person(id, name);            
            
            if(!people.contains(p)){
                people.add(p);
            }        
        }
        System.out.println("==Items==");
        
        for(Person p : people){
            System.out.println(p.getId() + ": " + p.getName());
        
        }
    }
}
