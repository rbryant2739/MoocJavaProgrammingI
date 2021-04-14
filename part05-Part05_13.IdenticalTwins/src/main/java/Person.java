
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    @Override
    public boolean equals(Object compared){
    
        Person other = (Person) compared;
        
        return this.name.equals(other.name) &&
                this.birthday.equals(other.birthday) &&
                this.height == other.height &&
                this.weight == other.weight;
    
    }
    // implement an equals method here for checking the equality of objects
}
