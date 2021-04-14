
import java.util.*;
import java.lang.*;

public class Recipe {

    private String name;
    private int duration;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time) {
        this.name = name;
        this.duration = time;
        this.ingredients = new ArrayList();
    }

    public String nameOfRecipe() {
        return this.name;
    }

    public int timeToCook() {
        return this.duration;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public boolean containsIngredient(String i) {
        return this.ingredients.contains(i);
    }

    public void list() {
        System.out.println(this.name + ", cooking time: " + this.duration);
    }
}
