
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
       
    final int MAX_LIQUID = 100;    
    int one = 0;
    int two = 0;
    

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + one + "/100");
            System.out.println("Second: " + two + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if (command.equals("add")) {
                    if(amount > 0){
                        one += amount;
                        if(one > MAX_LIQUID){
                            one = MAX_LIQUID;
                        }
                    }
                } else if (command.equals("move")) {
                    if (amount > 0) {
                        if(amount > one){
                            two += one;
                            one = 0;
                        } else {
                            one -= amount;
                            two += amount;
                        }
                        if(two > MAX_LIQUID){
                            two = MAX_LIQUID;
                        }
                    }
                } else if (command.equals("remove")) {
                    if (amount > 0) {
                        two -= amount;
                        if (two < 0) {
                            two = 0;
                        }
                    }
                }
            }

        }
    }

}
