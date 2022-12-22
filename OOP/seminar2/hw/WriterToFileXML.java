package OOP.seminar2.hw;

import java.io.*;
import java.util.*;

public class WriterToFileXML extends WriterToFile {
    public WriterToFileXML(String fileName) {
        super(fileName);
    }

    @Override
    public void writeDataToFile(List<Student> lst) {

        try (FileWriter writer = new FileWriter(getFileName())) {
            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
            writer.write("<students>\n");
            for (Student rec : lst) {
                writer.write("\t<student>\n");
                writer.write(String.format("\t\t<name>%s</name>\n", rec.getName()));
                writer.write(String.format("\t\t<grade>%s</grade>\n", rec.getGrade()));
                writer.write("\t</student>\n");
            }
            writer.write("</students>\n");

            System.out.println("XML-файл сформирован");
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }
    }
}