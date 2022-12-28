package OOP.seminar3.hw;

import java.util.Iterator;

public class ReverseIterator implements Iterator<Student> {
    private int index;
    private StudentGroup group;

    public ReverseIterator(StudentGroup group) {
        this.group = group;
        index = group.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Student next() {
        return group.get(index--);
    }
}
