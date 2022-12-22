package OOP.seminar2.hw;

import java.io.*;
import java.util.*;

public class WriterToFileJson extends WriterToFile {
    public WriterToFileJson(String fileName) {
        super(fileName);
    }

    @Override
    public void writeDataToFile(List<Student> lst) {

        try (FileWriter writer = new FileWriter(getFileName())) {
            writer.write("{\n");

            int i = 1;
            for (Student rec : lst) {
                writer.write(String.format("\t\"%s\": \"%s\"%s\n", rec.getName(), rec.getGrade(),
                        i++ < lst.size() ? "," : ""));
            }
            writer.write("}\n");

            System.out.println("Json-файл сформирован");
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }
    }
}
