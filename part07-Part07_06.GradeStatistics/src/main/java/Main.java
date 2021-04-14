
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseStats stats = new CourseStats();
        System.out.println("Enter point totals, -1 stops:");

        int grade;

        while (true) {
            grade = Integer.valueOf(scanner.nextLine());

            if (grade == -1) {
                break;
            }
            stats.addGrade(grade);
        }

        System.out.println("Point average (all): " + stats.getAverageOfAllGrades());
        System.out.println("Point average (passing): " + stats.getAverageOfPassingGrades());
        System.out.println("Pass percentage: " + stats.percentPassing());
        System.out.println("Grade distribution:");
        stats.printGradeDistribution();
    }
}
