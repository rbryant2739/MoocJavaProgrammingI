
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int grade = Integer.valueOf(scan.nextLine());
        String feedback = "";
        
        if(grade < 0){
            feedback = "impossible!";
        } else if(grade < 50){
            feedback = "failed";
        } else if(grade < 60){
            feedback = "1";
        } else if(grade < 70){
            feedback = "2";
        } else if(grade < 80){
            feedback = "3";
        } else if(grade < 90){
            feedback = "4";
        } else if(grade < 101){
            feedback = "5";
        } else {
            feedback = "incredible!";
        }
        System.out.println("Grade: " + feedback);
    }
}
