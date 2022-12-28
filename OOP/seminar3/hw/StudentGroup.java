package OOP.seminar3.hw;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup {

	private List<Student> students;

	public StudentGroup(List<Student> students) {
		this.students = students;
	}

	public int size() {
		return students.size();
	}

	public Student get(int index) {
		return students.get(index);
	}

	public void add(Student e) {
		students.add(e);
	}

	public Iterator<Student> descendingIterator() {
		return new ReverseIterator(this);
	}

	public ListIterator<Student> listIterator(int index) {
		return new GroupListIterator(this, index);
	}
}
