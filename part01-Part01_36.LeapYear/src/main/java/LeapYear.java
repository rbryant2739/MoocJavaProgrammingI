
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean isLeap = false;
        
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        if(year % 100 == 0){
            if(year % 400 == 0){
                isLeap = true;
            }
        } else if(year % 4 == 0){
            isLeap = true;
        }
        System.out.println("The year is " + (isLeap? "":"not ") + "a leap year.");
        
    }
}
