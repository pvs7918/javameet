/*Создайте класс Student. У студента есть имя, дата рождения и средний балл.
Переопределите функцию toString ( ).
Создайте класс StudentGroup. Она содержит коллекцию студентов.
Для коллекции StudentGroup создайте парный класс итератора: StudentGroupIterator.
Он реализует интерфейс Iterator<Student>. Он отслеживает текущую позицию в итерации.
Класс StudentGroup реализует интерфейс Iterable<Student>.
Это позволяет начать итерацию по группе.*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<ContrAgent> listStudents = new ArrayList<>();
		listStudents.add(new ContrAgent("Иванов", LocalDate.of(2002,10,19), 4.9f));
		listStudents.add(new ContrAgent("Петров", LocalDate.of(2001,12,12), 5.0f));
		listStudents.add(new ContrAgent("Сидоров", LocalDate.of(1999,1,13), 3.1f));
		StudentGroup studentGroup = new StudentGroup(listStudents);
		for(ContrAgent student: studentGroup){
			System.out.println(student);
		}
	}
}
