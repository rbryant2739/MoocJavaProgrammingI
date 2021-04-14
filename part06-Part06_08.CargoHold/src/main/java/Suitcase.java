
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight = 0;

    public Suitcase(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (currentWeight + item.getWeight() <= maxWeight) {
            items.add(item);
            currentWeight += item.getWeight();
        }
    }
    
    public Item heaviestItem(){
        int max = -1;
        Item heaviest = null;
        
        for(Item i : items){
            if(i.getWeight() > max){
                max = i.getWeight();
                heaviest = i;
            }
        }
        return heaviest;    
    }
    
    

    public String toString() {
        String val;

        if (items.isEmpty()) {
            val = "no items (0 kg)";
        } else if(items.size() == 1){
            val = "1 item (" + this.currentWeight + " kg)";
        } else {
            val = items.size() + " items (" + this.currentWeight + " kg)";
        }
        return val;
    }
    
    public void printItems(){
        for(Item i : this.items){
            System.out.println(i);
        }
    }
    public int totalWeight(){
        return this.currentWeight;
    }
}
