package OOP.seminar3.hw;

import java.time.LocalDate;

public class Student {
    private String name;
	private LocalDate date;
	private float averageMark;

	public Student(String name, LocalDate date, float averageMark) {
		this.name = name;
		this.date = date;
		this.averageMark = averageMark;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", date=" + date +
				", averageMark=" + averageMark +
				'}';
	}


}
