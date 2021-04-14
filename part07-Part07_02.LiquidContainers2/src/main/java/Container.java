
import java.util.*;

public class Container {

    static final int FULL = 100;
    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return amount;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.amount += amount;
        }
        if (this.amount > FULL) {
            this.amount = FULL;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.amount -= amount;
        }
        if (this.amount < 0) {
            this.amount = 0;
        }
    }
    
    public String toString() {
        return this.amount + "/100"; 
    }

}
