package service;

import data.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsService implements DataService <Student> {
    private List<Student> students = new ArrayList<>();

    public StudentsService(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAll(){
        List<Student> copy = new ArrayList<>();
        for (Student student: students
             ) {
            copy.add(student);
        }
        return copy;
    }

    @Override
    public void add (Student student) {
        students.add(student);
    }

    @Override
    public void saveUser() {

    }

    @Override
    public List loadUser() {
        return null;
    }
}
