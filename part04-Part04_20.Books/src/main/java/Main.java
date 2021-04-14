
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int pages;
        int year;

        while (!name.equals("")) {
            pages = Integer.valueOf(scanner.nextLine());
            year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, pages, year));
            name = scanner.nextLine();
        }

        System.out.println("What information will be printed?");
        String response = scanner.nextLine();

        if (response.equals("everything")) {
            for (Book b : books) {
                System.out.println(b.everything());
            }
        } else if (response.equals("name")){
            for (Book b : books) {
                System.out.println(b.getTitle());
            }
        }
    }
}
