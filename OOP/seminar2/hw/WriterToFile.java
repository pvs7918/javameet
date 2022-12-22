package OOP.seminar2.hw;

import java.io.*;
import java.util.*;

// Абстрактный класс FileWriter. Имеет 3 наследников
public abstract class WriterToFile {
    protected String fileName; // поля типа protected доступны в классах наследниках

    // конструктор
    public WriterToFile(String fileName) {
        this.fileName = fileName;
    }

    // метод общий для всех классов наследников определяем здесь, в абстрактном
    // классе
    public String getFileName() {
        return fileName;
    }

    // абстрактный метод записи в файл списка объектов Student
    public abstract void writeDataToFile(List<Student> lst);
}
