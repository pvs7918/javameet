package OOP.seminar5.lesson.task1.alex.service;

import java.nio.charset.UnsupportedCharsetException;
import java.util.List;

import OOP.seminar5.lesson.task1.alex.data.*;
import OOP.seminar5.lesson.task1.alex.util.*;

public class UserService implements DataService<Student> {
    private List<Student> students;

    public UserService(List<Student> students) {
        this.students = students;
    }

    @Override
    public void add(Student user) {
        students.add(user);
    }

    @Override
    public List<Student> load() {
        OurFileReader oFR = new OurFileReader();
        return oFR.fileReader();
    }

    @Override
    public void save(List<Student> users) {
        OurFileWriter oFW = new OurFileWriter();
        oFW.fileWriter(users);
    }

}
