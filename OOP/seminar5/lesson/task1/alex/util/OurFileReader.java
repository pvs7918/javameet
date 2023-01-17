package OOP.seminar5.lesson.task1.alex.util;

import java.io.*;
import java.util.*;

import OOP.seminar5.lesson.task1.alex.data.*;

public class OurFileReader {

    public List<Student> fileReader() {
        List<Student> students = new LinkedList<>();
        try (FileReader fr = new FileReader("Students.txt")) {
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNextLine()) {
                String studentData = scanner.nextLine();
                String[] parts = studentData.split(", ");
                Student student = new Student(parts[0], Integer.parseInt(parts[1]), parts[2], parts[3]);
                students.add(student);

            }
            scanner.close();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return students;
    }
}
