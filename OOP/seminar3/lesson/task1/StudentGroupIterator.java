import java.util.Iterator;
/*Для коллекции StudentGroup создайте парный класс итератора: StudentGroupIterator.
Он реализует интерфейс Iterator<Student>. Он отслеживает текущую позицию в итерации.*/

public class StudentGroupIterator implements Iterator<ContrAgent> {

	private int index = -1;
	private StudentGroup studentGroup;

	public StudentGroupIterator(StudentGroup studentGroup) {
		this.studentGroup = studentGroup;
	}

	@Override
	public boolean hasNext() {
		return index < studentGroup.getSize()-1;
	}

	@Override
	public ContrAgent next() {
		return studentGroup.get(++index);
	}
}
