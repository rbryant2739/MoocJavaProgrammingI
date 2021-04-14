
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
    
    public double averageOfGrades(){
        int sum = 0;
        
        if(!this.grades.isEmpty()){
            for(Integer i : this.grades){
                sum += i;
            }
        }
        return this.grades.isEmpty()? -1 : sum / (this.grades.size() * 1.0);
    }
    
    public double averageOfPoints(){
        int sum = 0;
        
        if(!this.points.isEmpty()){
            for(Integer i : this.points){
                sum += i;
            }
        }
        return this.points.isEmpty()? -1 : sum / (this.points.size() * 1.0);
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
