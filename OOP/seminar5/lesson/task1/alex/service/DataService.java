package OOP.seminar5.lesson.task1.alex.service;

import java.util.List;

import OOP.seminar5.lesson.task1.alex.data.*;

public interface DataService<T extends User> {
    public void add(T user);

    public void save(List<T> users);

    public List<T> load();
}
