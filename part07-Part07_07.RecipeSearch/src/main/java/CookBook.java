
import java.util.*;
import java.lang.*;

public class CookBook {

    private ArrayList<Recipe> recipes;

    public CookBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }

    public void listRecipes() {
        for (Recipe r : this.recipes) {
            r.list();
        }
    }

    public void findRecipeName(String name) {
        for (Recipe r : this.recipes) {
            if (r.nameOfRecipe().contains(name)) {
                r.list();
            }
        }
    }

    public void findRecipeTime(int duration) {
        for (Recipe r : this.recipes) {
            if (r.timeToCook() <= duration) {
                r.list();
            }
        }
    }

    public void findIngredient(String ingredient) {
        for (Recipe r : this.recipes) {
            if (r.containsIngredient(ingredient)) {
                r.list();
            }
        }
    }
}
