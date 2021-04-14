import java.util.*;
import java.lang.*;

public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latin){
        this.name = name;
        this.latinName = latin;
        this.observations = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public void observe(){
        this.observations++;
    }
    
    public int getObservations(){
        return this.observations;
    }
    
    public String toString(){
        return this.getName() + " (" + this.getLatinName() + "): "
                + this.observations + " observations";
    }
}
