
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read:");
        String file = scanner.nextLine();

        try {
            Scanner reader = new Scanner(Paths.get(file));
            CookBook cookBook = new CookBook();
            String name;
            int ttc;                    //time_to_cook
            String ingredient;
            Recipe toBeAdded;

            while (reader.hasNextLine()) {

                name = reader.nextLine();
                ttc = Integer.valueOf(reader.nextLine());
                ingredient = reader.nextLine();

                toBeAdded = new Recipe(name, ttc);

                while (!ingredient.equals("") && reader.hasNextLine()) {
                    toBeAdded.addIngredient(ingredient);
                    ingredient = reader.nextLine();
                }
                cookBook.addRecipe(toBeAdded);
            }

            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("");
            System.out.println("Enter command: ");

            String command = scanner.nextLine();
            String wordSearch;
            int cookTime;

            while (!command.equals("stop")) {
                if (command.equals("list")) {

                    System.out.println("Recipes:");
                    cookBook.listRecipes();

                } else if (command.equals("find name")) {
                    System.out.println("Searched word: ");
                    wordSearch = scanner.nextLine();

                    System.out.println("");
                    System.out.println("Recipes:");

                    cookBook.findRecipeName(wordSearch);
                } else if (command.equals("find cooking time")) {
                    System.out.println("Max cooking time: ");
                    cookTime = Integer.valueOf(scanner.nextLine());

                    System.out.println("");
                    System.out.println("Recipes: ");

                    cookBook.findRecipeTime(cookTime);
                } else if (command.equals("find ingredient")) {
                    System.out.println("Ingredient: ");
                    wordSearch = scanner.nextLine();

                    System.out.println("");
                    System.out.println("Recipes: ");

                    cookBook.findIngredient(wordSearch);
                }
                System.out.println("");
                System.out.println("Enter command: ");
                command = scanner.nextLine();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
