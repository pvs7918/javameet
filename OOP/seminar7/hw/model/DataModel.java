package OOP.seminar7.hw.model;

import java.util.List;

import OOP.seminar7.hw.classes.*;

public interface DataModel<T> {
    public void add(T rec);
    public void save();
    public List<T> load();
}
