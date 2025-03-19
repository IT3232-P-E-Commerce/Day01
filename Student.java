//6) Create a student class
//	-create 5 student objects and store it in 
//	a proper datastructure
//- find the average marks of the students

import java.util.*;

public class Student{
    private String name;
    private int marks;

    public Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMarks(){
        return this.marks;
    }

    public void setMarks(int marks){
        this.marks=marks;
    }   
}
