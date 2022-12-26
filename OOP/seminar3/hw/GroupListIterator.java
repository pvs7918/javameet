package OOP.seminar3.hw;

import java.util.Iterator;
import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {
    private int index = 0;
    private StudentGroup studGroup;

    public GroupListIterator(StudentGroup studGroup, int index) {
        this.index = index;
        this.studGroup = studGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studGroup.size();
    }
    
    @Override
    public boolean hasPrevious() {
        return index > -1;
    }

    @Override
    public Student next() {
        index++;
        if (hasNext())
            return studGroup.get(index);
        else
            return null;
    }

    @Override
    public Student previous() {
        index--;
        if (hasPrevious())
            return studGroup.get(index);
        else
            return null;
    }

    @Override
    public int nextIndex() {
        return ++index;
    }

    @Override
    public int previousIndex() {
        return --index;
    }

    @Override
    public void add(Student e) {
        studGroup.add(e);
    }

    /*@Override
    public void remove() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void set(Student e) {
        // TODO Auto-generated method stub
        
    }*/    
    
}
