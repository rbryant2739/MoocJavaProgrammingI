
import java.util.*;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        String joke;

        if (jokes.isEmpty()) {
            joke = "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            joke = jokes.get(draw.nextInt(jokes.size()));
        }
        return joke;
    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
