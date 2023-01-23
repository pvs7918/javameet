package OOP.seminar6.hw.task2;

import java.util.List;

public class MutableList<T> extends CommonList {

    public MutableList(List<T> list) {
        super(list);
    }

    public void set(int i, T newValue) {
        if (i > -1 && i < getSize())
            super.list.set(i, newValue);
        else
            System.out.println("Указанный индекс %d выходит за пределы массива");
    }

    public void add(T newValue) {
        super.list.add(super.list.size(), newValue);
    }

    public void remove(T value) {
        super.list.remove(value);
    }

}
