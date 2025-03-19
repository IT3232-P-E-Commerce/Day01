import java.util.*;

public class Studentmain {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        
       
        students[0] = new Student("Alice", 92);
        students[1] = new Student("Bob", 78);
        students[2] = new Student("Charlie", 85);
        students[3] = new Student("Dave",90);
        students[4] = new Student("Eve",88);
        
       
        int totalMarks = 0;
        for (Student student : students) {
            totalMarks = totalMarks + student.getMarks();
        }
        double averageMarks = totalMarks / students.length;
        
        System.out.printf("\nAverage marks: %.2f", averageMarks);
    }
}