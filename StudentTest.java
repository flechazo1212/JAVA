import java.util.Scanner;

public class StudentTest{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter student number: ");
        int n = s.nextInt();
        
        Student[] students = new Student[n];
        
        inputStudents(students, s);
        
        sortScores(students);

        printStudents(students);
    }

    public static void inputStudents(Student[] students, Scanner s){
        for(int i = 0; i < students.length; i++){
            System.out.println("enter student name " + (i + 1) + ": ");
            String name = s.nextLine();
        }
        for(int i = 0; i < students.length;i++){
            System.out.println("enter student score " + (i + 1) + ": ");
            double score = s.nextInt();
        }
    }

    public static void printStudents(Student[] students) {
        for(int i = 0; i < students.length; i++) {
            students[i].printStudent();
        }
    }

    public static void sortScores(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getScore() < students[j + 1].getScore()) {
                Student temp = students[j];
                students[j] = students[j + 1];
                students[j + 1] = temp;
                }
            }
        }
    }
}