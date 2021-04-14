
import java.util.*;
import java.lang.*;

public class CourseStats {

    private ArrayList<Integer> points;
    private int[] gradeDistribution;

    public CourseStats() {
        points = new ArrayList();
        gradeDistribution = new int[6];
    }

    public ArrayList<Integer> getPoints() {
        return this.points;
    }

    public int[] getGradeDistribution() {
        return this.gradeDistribution;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {

            this.points.add(grade);

            if (grade < 50) {
                this.gradeDistribution[0]++;
            } else if (grade < 60) {
                this.gradeDistribution[1]++;
            } else if (grade < 70) {
                this.gradeDistribution[2]++;
            } else if (grade < 80) {
                this.gradeDistribution[3]++;
            } else if (grade < 90) {
                this.gradeDistribution[4]++;
            } else {
                this.gradeDistribution[5]++;
            }
        }
    }

    public double getAverageOfAllGrades() {
        int sum = 0;
        double avg = -1;

        if (!this.points.isEmpty()) {
            for (int i : this.points) {
                sum += i;
            }

            avg = sum / (this.points.size() * 1.0);
        }
        return avg;
    }

    public double getAverageOfPassingGrades() {
        int sum = 0;
        int numOfPassing = 0;

        if (!this.points.isEmpty()) {
            for (int i : this.points) {
                if (i > 49) {
                    sum += i;
                    numOfPassing++;
                }
            }
        }
        return numOfPassing > 0 ? (sum / (numOfPassing * 1.0)) : -1;
    }

    public double percentPassing() {
        int numOfPassing = 0;

        for (Integer i : this.points) {
            if (i > 49) {
                numOfPassing++;
            }
        }
        return 100.0 * (numOfPassing / (this.points.size() * 1.0));
    }

    public void printGradeDistribution() {

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ":");
            for (int j = 0; j < this.gradeDistribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
