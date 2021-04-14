
public class Book implements Comparable<Book> {

    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public int compareTo(Book o){
        int val = 0;
        
        if(this.id > o.getId()){
            val = 1;
        } else if (this.id < o.getId()) {
            val = -1;
        }         
        return val; 
    }
    @Override
    public String toString() {
        return "(id: " + id + "; name: " + name + ")";
    }

}
