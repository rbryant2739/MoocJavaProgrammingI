import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int currentWeight = 0;
    
    public Hold(int maxWeight){
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        if(currentWeight + suitcase.totalWeight() <= maxWeight){
            
            suitcases.add(suitcase);
            currentWeight += suitcase.totalWeight();
        }
    }
    
    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.currentWeight + " kg)";
    }
    
    public void printItems(){
        System.out.println("The suitcases in the hold contain the following items:");
        
        for(Suitcase s : suitcases){
            s.printItems();
        }
    }
}
