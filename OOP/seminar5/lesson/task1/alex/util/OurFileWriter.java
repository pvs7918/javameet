package OOP.seminar5.lesson.task1.alex.util;

import java.io.*;
import java.util.*;

import OOP.seminar5.lesson.task1.alex.data.*;

public class OurFileWriter {

    public void fileWriter(List<Student> students) {
        try (FileWriter fw = new FileWriter("Students.txt")) {
            for (Student student : students) {
                fw.append(student.getStudentFields());
            }
            fw.close();
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
    }
}
