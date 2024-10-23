import java.util.Scanner;
import java.util.Arrays;

class Student{
    private String name;
    private double score;

    // constructor
    public Student(String name, double score){
        this.name = name;
        this.score = score;
   }
    // setter, getter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getScore(){
        return score;
    }

    public void setScore(double score){
        this.score = score;
    }

    // print name and score 
    public void printStudent(){
        System.out.print("name: " + name + " score: " + score);
   }

}

public class StudentTest{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter student number: ");
        int n = s.nextInt()();
        String[] Student = new Student();

    }

    public static void inputStudents(Student[] students, Scanner s){
        for(int i = 0; i < students.length; i++){
            System.out.println("enter student name " + (i + 1) + ": ");
            String name = s.nextLine();
        }
        for(int i = 0; i < students.length;i++){
            System.out.println("enter student score " + (i + 1) + ": ");
            int score = s.nextInt();
        }
    }

    public static void printStudents(Student[] students) {
        for(int i = 0; i < students.length; i++) {
            students[i].printStudent();
        }
    }

    public static void sortScores(Student[] students) {
        for(int i = 0; i < students.length - 1; i++) {
            for(int j = i + 1; j < students.length; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
}

