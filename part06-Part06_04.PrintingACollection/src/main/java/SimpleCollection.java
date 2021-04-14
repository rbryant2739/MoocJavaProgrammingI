
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        
        String alpha = "The collection " + this.name;
        int size = elements.size();
        
        if(size == 0){
            alpha = alpha + " is empty.";
        } else if (size == 1){
            
            alpha = alpha + " has 1 element:" + "\n"
                    + elements.get(0);        
        } else {
            alpha = alpha + " has " + size + " elements:"
                    + "\n";
            for (String s : elements){
                alpha = alpha + s + "\n";
            }
        
        }        
        return alpha;
    }
    
}
