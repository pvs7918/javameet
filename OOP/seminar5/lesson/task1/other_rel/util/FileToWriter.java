package util;

import data.Student;
import service.StudentsService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileToWriter {
    public String text;
    public static void write(StudentsService students){
        try(FileWriter file = new FileWriter("markClass.txt"))

        {
            for (Student student : students.getAll()) {
                file.write(student.toString());
            }
        } catch(IOException e)

        {
            e.printStackTrace();


        }
    }


}










