import java.time.LocalDate;

public class Student {

	public Student(String name, LocalDate date, float averageMark) {
		this.name = name;
		this.date = date;
		this.averageMark = averageMark;
	}

	/*Создайте класс Student. У студента есть имя, дата рождения и средний балл. Переопределите функцию toString ( ).
	Создайте класс StudentGroup. Она содержит коллекцию студентов.
	Для коллекции StudentGroup создайте парный класс итератора: StudentGroupIterator. Он реализует интерфейс Iterator<Student>. Он отслеживает текущую позицию в итерации.
	Класс StudentGroup реализует интерфейс Iterable<Student>. Это позволяет начать итерацию по группе.


		 */
    private String name;
	private LocalDate date;
	private float averageMark;



	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", date=" + date +
				", averageMark=" + averageMark +
				'}';
	}


}
