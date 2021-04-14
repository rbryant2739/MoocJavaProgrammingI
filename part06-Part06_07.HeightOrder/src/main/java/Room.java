import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
    
    public Room(){
        people = new ArrayList<>();
    }
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public boolean isEmpty(){
        return this.people.size() == 0;
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        int minHeight = 2147483647;  //max positive value integer can hold
        Person shortestPerson = null;
        
        if(!(this.people.isEmpty())){
            for(Person p : people){
                if(p.getHeight() < minHeight){
                    minHeight = p.getHeight();
                    shortestPerson = p;
                }
            }
        } return shortestPerson;
    }
    
    public Person take(){
        Person shortest = this.shortest();
        
        this.people.remove(shortest);
        
        return shortest;
    }
    
}
