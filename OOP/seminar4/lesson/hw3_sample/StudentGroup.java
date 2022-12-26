package iterators;

import java.util.*;

public class StudentGroup {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public int size () { return students.size (); }

    public Student get (int index) { return students.get (index); }


    public Iterator<Student> descendingIterator () {
        return new ReverseIterator(this);
    }

    public ListIterator<Student> listIterator (int index) {
        return new TwoSidedIterator(this, index);
    }
}
