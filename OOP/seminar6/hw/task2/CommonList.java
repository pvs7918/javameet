package OOP.seminar6.hw.task2;

import java.util.List;

public abstract class CommonList<T> {
    protected List<T> list;

    public CommonList(List<T> list) {
        this.list = list;
    }

    // общие методы
    public int getSize() {
        return list.size();
    }

    public T get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        int i = 1;
        String result = "[list = ";
        for (T item : list) {
            result += item + (i < list.size() ? ",\n" : "]");
            i++;
        }
        return result;
    }

}
