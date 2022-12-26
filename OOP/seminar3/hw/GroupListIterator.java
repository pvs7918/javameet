package OOP.seminar3.hw;

import java.util.Iterator;
import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {
    private int index = 0;
    private StudentGroup studGroup;

    public GroupListIterator(StudentGroup studGroup) {
        this.studGroup = studGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studGroup.size();
    }

    @Override
    public Student next() {
        index++;
        if (hasNext())
            return studGroup.get(index);
    }

    @Override
    public boolean hasPrevious() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Student previous() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int nextIndex() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int previousIndex() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void set(Student e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void add(Student e) {
        // TODO Auto-generated method stub
        
    }
    
}
