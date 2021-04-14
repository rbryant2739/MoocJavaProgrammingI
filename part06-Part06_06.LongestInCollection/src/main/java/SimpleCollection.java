
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

    public String longest() {

        String maxElement = null;

        if (!this.elements.isEmpty()) {
            int maxLen = 0;

            for (String s : elements) {
                if (s.length() > maxLen) {
                    maxLen = s.length();
                    maxElement = s;
                }
            }
        }
        return maxElement;
    }

}
