import data.Student;
import service.StudentsService;
import util.FileToWriter;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ContrAgent> students = new ArrayList<>();
        ContrAgent student = new ContrAgent( 1, "Lera", 4.9f, "234");
        ContrAgent student1 = new ContrAgent( 2, "Lera", 4.9f, "234");
        students.add(student1);
        students.add(student);
        students.add(new ContrAgent(3, "Lika", 4.8f, "236"));
        students.add(new ContrAgent(4, "Nina", 4.8f, "236"));
        StudentsService studentsService = new StudentsService(students);
        FileToWriter.write(studentsService);
    }
}