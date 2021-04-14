
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i< number; i++){
            builder.append('*');
        }
        
        System.out.println(builder.toString());
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i< number; i++){
            builder.append(' ');
        }
        
        System.out.print(builder.toString());
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int stars = 1;
        int spaces = size - 1;
        
        for(int i = 0; i < size; i++){
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        //int width = ((height - 1) * 2) + 1;
        int stars = 1;
        for(int i = 1; i <= height; i++){
            printSpaces(height - i);
            printStars(stars);
            stars += 2;
        }
        
        int baseSpaces = (stars - 5) / 2;
        printSpaces(baseSpaces);
        printStars(3);
        printSpaces(baseSpaces);
        printStars(3);
        
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
