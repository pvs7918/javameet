import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<ContrAgent> {

	private List<ContrAgent> students;

	public StudentGroup(List<ContrAgent> students) {
		this.students = students;
	}

	public int getSize() {
		return this.students.size();
	}

	public ContrAgent get(int index) {
		return students.get(index);
	}

	@Override
	public Iterator<ContrAgent> iterator() {
		return new StudentGroupIterator(this);
	}
}
