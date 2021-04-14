
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First name:");
        
        String fName = scanner.nextLine();
        String lName;
        String id;
        
        while(!fName.equals("")){
            System.out.println("Last name:");
            lName = scanner.nextLine();
            
            System.out.println("Identification number:");
            id = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(fName, lName, id));
            
            fName = scanner.nextLine();        
        }
        for(PersonalInformation p : infoCollection){
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }
    }
}
