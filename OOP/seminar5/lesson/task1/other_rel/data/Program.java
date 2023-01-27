package data;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = new Student( 1, "Lera", 4.9f, "234");
        Student student1 = new Student( 2, "Lera", 4.9f, "234");
        students.add(student1);
        students.add(student);
        students.add(new Student(3, "Lika", 4.8f, "236"));
        students.add(new Student(4, "Nina", 4.8f, "236"));




    }

}
