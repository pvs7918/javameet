package OOP.seminar2.hw;

import java.io.*;
import java.util.*;

public class WriterToFileText extends WriterToFile {
    public WriterToFileText(String fileName) {
        super(fileName);
    }

    @Override
    public void writeDataToFile(List<Student> lst) {

        try (FileWriter writer = new FileWriter(getFileName())) {
            for (Student rec : lst) {
                writer.write(String.format("%s=%s\n", rec.getName(), rec.getGrade()));
            }

            System.out.println("Простой текстовый файл сформирован");
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }
    }
}
