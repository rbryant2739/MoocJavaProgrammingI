import java.util.ArrayList;
import java.lang.String;


public class Stack {
    private ArrayList<String> stack = new ArrayList<>();
    
    public boolean isEmpty(){
        return stack.size() == 0;
    }
    
    public void add(String value){
        stack.add(value);
    }
    
    public ArrayList<String> values(){
        return stack;
    }
    
    public String take(){
        String val = "";
        
        if(!stack.isEmpty()){
            val = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
        }
        return val;
    }
    
}
